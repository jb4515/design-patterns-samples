package problems.job.custom.workflow.model;


/**
 * Created by jitesh-kumar on 7/6/18.
 */
public enum JobCandidateStatus {
  ADDED_PROFILE(1, "ADDED_PROFILE"), SCREENING_DONE(2, "SCREENING_DONE"), SHORTLISTING_DONE(3, "SHORTLISTING_DONE"),
  INTERVIEW_SCHEDULING_PENDING(4, "INTERVIEW_SCHEDULING_PENDING"),
  INTERVIEW_SCHEDULING_DONE(5, "INTERVIEW_SCHEDULING_DONE"),
  INTERVIEW_PENDING(6, "INTERVIEW_PENDING"), INTERVIEW_DONE(7, "INTERVIEW_DONE"),
  RECEIVING_FEEDBACK_PENDING(8, "RECEIVING_FEEDBACK_PENDING"), FEEDBACK_DONE(9, "FEEDBACK_DONE"),
  OFFERED_JOB(10, "OFFERED_JOB");

  private int transitionOrder;
  private String label;

  JobCandidateStatus(final int transitionOrder, final String label) {
    this.transitionOrder = transitionOrder;
    this.label = label;
  }

  public int getTransitionOrder() {
    return transitionOrder;
  }
}
