package problems.job.custom.workflow.data;


import static java.lang.String.format;
import static java.util.Arrays.asList;
import static problems.job.custom.workflow.common.Constants.JOB;
import static problems.job.custom.workflow.common.Constants.SPACE_DELIMITER;
import static problems.job.custom.workflow.util.JobCandidateStatusUtil.sortByTransitionOrder;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import problems.job.custom.workflow.exception.NoSuchRecordException;
import problems.job.custom.workflow.exception.RecordAlreadyExistsException;
import problems.job.custom.workflow.model.Job;
import problems.job.custom.workflow.model.JobCandidateStatus;


/**
 * Created by jitesh-kumar on 7/6/18.
 */
public class JobDAO {

  private Pattern spaceSeparatedRegexPattern = Pattern.compile(SPACE_DELIMITER);

  private Map<Integer, Job> validJobs = new HashMap<>();
  private Map<Integer, JobCandidateStatus> currentCandidateStatusForJobs;

  public void add(Job job, String statusesSeparatedBySpace) {
    Integer jobId = job.getId();
    if (isExistingJob(jobId)) {
      throw new RecordAlreadyExistsException(JOB, jobId);
    }
    addJobCandidateStatusesForJob(jobId, job, statusesSeparatedBySpace);
    System.out.println(format("Successfully added job with id %s", job.getId()));
  }

  public boolean isExistingJob(Integer jobId) {
    return validJobs.containsKey(jobId);
  }

  private void addJobCandidateStatusesForJob(final Integer jobId, final Job job, final String statusesSeparatedBySpace) {
    //TODO use regex pattern matcher instead of split
    job.setJobCandidateStatuses(sortByTransitionOrder(asList(statusesSeparatedBySpace.split(SPACE_DELIMITER))));
    validJobs.put(jobId, job);
  }

  public void remove(Integer jobId) {
    if (!isExistingJob(jobId)) {
      throw new NoSuchRecordException(JOB, jobId);
    }
    validJobs.remove(jobId);
    System.out.println(format("Successfully removed job with id %s .", jobId));
  }
}
