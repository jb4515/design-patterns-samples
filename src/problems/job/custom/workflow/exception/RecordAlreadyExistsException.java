package problems.job.custom.workflow.exception;


import static java.lang.String.format;


/**
 * Created by jitesh-kumar on 7/6/18.
 */
public class RecordAlreadyExistsException extends RuntimeException {

  private static final String defaultErrorMessage = "%s with id %s already exists.";

  public RecordAlreadyExistsException(final String recordType, final Integer jobId) {
    super(format(defaultErrorMessage, recordType, jobId));
  }
}
