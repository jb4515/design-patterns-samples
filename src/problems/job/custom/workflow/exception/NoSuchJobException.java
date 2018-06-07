package problems.job.custom.workflow.exception;


import static java.lang.String.format;


/**
 * Created by jitesh-kumar on 7/6/18.
 */
public class NoSuchJobException extends RuntimeException {

  private static final String defaultErrorMessage = "Job with id {} does not exist.";

  public NoSuchJobException(final Integer jobId) {
    super(format(defaultErrorMessage, jobId));
  }
}
