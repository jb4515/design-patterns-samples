package problems.job.custom.workflow.service.chain;


/**
 * Created by jitesh-kumar on 7/6/18.
 */
public interface JobCandidateStatusChangeStep {

  void process(Integer jobId, Integer statusToBeChanged);

}
