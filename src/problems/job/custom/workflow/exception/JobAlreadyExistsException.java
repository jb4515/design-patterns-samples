package problems.job.custom.workflow.exception;


import static java.lang.String.format;


/**
 * Created by jitesh-kumar on 7/6/18.
 */
public class JobAlreadyExistsException extends RuntimeException {

  private static final String defaultErrorMessage = "Job with id {} has already been created.";

  public JobAlreadyExistsException(final Integer jobId) {
    super(format(defaultErrorMessage, jobId));
  }
}
