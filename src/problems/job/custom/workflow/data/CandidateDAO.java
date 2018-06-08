package problems.job.custom.workflow.data;


import static java.lang.String.format;
import static problems.job.custom.workflow.common.Constants.CANDIDATE;

import java.util.HashMap;
import java.util.Map;

import problems.job.custom.workflow.exception.NoSuchRecordException;
import problems.job.custom.workflow.exception.RecordAlreadyExistsException;
import problems.job.custom.workflow.model.Candidate;


/**
 * Created by jitesh-kumar on 8/6/18.
 */
public class CandidateDAO {

  private Map<Integer, Candidate> validCandidates = new HashMap<>();

  public void add(Candidate candidate) {
    Integer candidateId = candidate.getId();
    if (isExistingCandidate(candidateId)) {
      throw new RecordAlreadyExistsException(CANDIDATE, candidateId);
    }
    validCandidates.put(candidateId, candidate);
    System.out.println(format("Successfully added candidate with id %s", candidate.getId()));
  }

  public boolean isExistingCandidate(Integer candidateId) {
    return validCandidates.containsKey(candidateId);
  }

  public void remove(Integer candidateId) {
    if (!isExistingCandidate(candidateId)) {
      throw new NoSuchRecordException(CANDIDATE, candidateId);
    }
    //TODO could you replace set data structure with something more efficient?
    validCandidates.remove(candidateId);
    System.out.println(format("Successfully removed candidate with id %s .", candidateId));
  }
}
