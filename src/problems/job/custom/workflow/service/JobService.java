package problems.job.custom.workflow.service;


import problems.job.custom.workflow.data.JobDAO;


/**
 * Created by jitesh-kumar on 7/6/18.
 */
public class JobService {

  private JobDAO jobDAO = new JobDAO();

  public void add(Integer jobId, String transitionOrders) {
    jobDAO.add(jobId, transitionOrders);
    System.out.println(String.format("Successfully added job with id {} and transition orders as {}", jobId, transitionOrders));
  }

  public void remove(Integer jobId) {
    jobDAO.removeJobFromValidJobs(jobId);
    System.out.println(String.format("Successfully removed job with id {} .", jobId));
  }

}
