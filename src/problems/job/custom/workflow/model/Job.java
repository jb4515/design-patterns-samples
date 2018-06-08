package problems.job.custom.workflow.model;


import java.util.List;


/**
 * Created by jitesh-kumar on 7/6/18.
 */
public class Job {

  private Integer id;
  private String title;
  private List<JobCandidateStatus> jobCandidateStatuses;

  public Job(final Integer id, final String title) {
    this.id = id;
    this.title = title;
  }

  public Integer getId() {
    return id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(final String title) {
    this.title = title;
  }

  public List<JobCandidateStatus> getJobCandidateStatuses() {
    return jobCandidateStatuses;
  }

  public void setJobCandidateStatuses(final List<JobCandidateStatus> jobCandidateStatuses) {
    this.jobCandidateStatuses = jobCandidateStatuses;
  }

  @Override public String toString() {
    return "Job{" +
             "id=" + id +
             ", title='" + title + '\'' +
             ", jobCandidateStatuses=" + jobCandidateStatuses +
             '}';
  }
}
