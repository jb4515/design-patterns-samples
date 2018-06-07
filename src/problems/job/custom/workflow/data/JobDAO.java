package problems.job.custom.workflow.data;


import static java.util.Arrays.asList;
import static problems.job.custom.workflow.common.Constants.SPACE_DELIMITER;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import problems.job.custom.workflow.JobCandidateStatusUtil;
import problems.job.custom.workflow.exception.JobAlreadyExistsException;
import problems.job.custom.workflow.exception.NoSuchJobException;
import problems.job.custom.workflow.model.JobCandidateStatus;


/**
 * Created by jitesh-kumar on 7/6/18.
 */
public class JobDAO {

  private Pattern spaceSeparatedRegexPattern = Pattern.compile(SPACE_DELIMITER);

  private Map<Integer, List<JobCandidateStatus>> validCandidateStatusesForJobs = new HashMap<>();
  private Map<Integer, JobCandidateStatus> currentCandidateStatusForJobs;

  public void add(Integer jobId, String statusesSeparatedBySpace) {
    if (validCandidateStatusesForJobs.containsKey(jobId)) {
      throw new JobAlreadyExistsException(jobId);
    }
    addJobCandidateStatusesForJob(jobId, statusesSeparatedBySpace);
  }

  private void addJobCandidateStatusesForJob(final Integer jobId, final String statusesSeparatedBySpace) {
    //TODO use regex pattern matcher instead of split
    validCandidateStatusesForJobs.put(jobId, JobCandidateStatusUtil
                                               .sortByTransitionOrder(asList(statusesSeparatedBySpace.split(SPACE_DELIMITER))));
  }

  public void removeJobFromValidJobs(Integer jobId) {
    if (!validCandidateStatusesForJobs.containsKey(jobId)) {
      throw new NoSuchJobException(jobId);
    }
    validCandidateStatusesForJobs.remove(jobId);
  }
}
