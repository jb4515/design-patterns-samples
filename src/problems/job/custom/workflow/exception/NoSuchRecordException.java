package problems.job.custom.workflow.exception;


import static java.lang.String.format;


/**
 * Created by jitesh-kumar on 7/6/18.
 */
public class NoSuchRecordException extends RuntimeException {

  private static final String defaultErrorMessage = "%s with id %s does not exist.";

  public NoSuchRecordException(final String recordType, final Integer jobId) {
    super(format(defaultErrorMessage, recordType, jobId));
  }
}
