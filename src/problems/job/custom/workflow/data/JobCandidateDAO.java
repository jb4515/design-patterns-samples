package problems.job.custom.workflow.data;


import static java.lang.String.format;
import static problems.job.custom.workflow.common.Constants.CANDIDATE;
import static problems.job.custom.workflow.common.Constants.JOB;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import problems.job.custom.workflow.exception.NoSuchRecordException;


/**
 * Created by jitesh-kumar on 7/6/18.
 */
public class JobCandidateDAO {

  private JobDAO jobDAO = new JobDAO();
  private CandidateDAO candidateDAO = new CandidateDAO();

  private Map<Integer, List<Integer>> validJobCandidates = new HashMap<>();

  public void add(Integer jobId, Integer candidateId) {
    validateJobAndCandidate(jobId, candidateId);
    if (isExistingJobCandidate(jobId, candidateId)) {
      throw new NoSuchRecordException(CANDIDATE, jobId);
    }
    addCandidateToJob(jobId, candidateId);
    System.out.println(format("Successfully added job candidate for job id %s, candidate id %s", jobId, candidateId));
  }

  private void validateJobAndCandidate(final Integer jobId, final Integer candidateId) {
    if (!jobDAO.isExistingJob(jobId)) {
      throw new NoSuchRecordException(JOB, jobId);
    }
    if (!candidateDAO.isExistingCandidate(candidateId)) {
      throw new NoSuchRecordException(CANDIDATE, jobId);
    }
  }

  public boolean isExistingJobCandidate(Integer jobId, Integer candidateId) {
    return validJobCandidates.get(jobId).contains(candidateId);
  }

  private void addCandidateToJob(final Integer jobId, final Integer candidateId) {
    List<Integer> jobCandidates = validJobCandidates.get(jobId);
    jobCandidates.add(candidateId);
    validJobCandidates.put(jobId, jobCandidates);
  }

  public void remove(Integer jobId, Integer candidateId) {
    validateJobAndCandidate(jobId, candidateId);
    if (!isExistingJobCandidate(jobId, candidateId)) {
      throw new NoSuchRecordException(CANDIDATE, candidateId);
    }
    validJobCandidates.remove(jobId);
    System.out.println(format("Successfully removed job candidate for job id %s, candidate id %s", jobId, candidateId));
  }
}
