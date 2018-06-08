package problems.job.custom.workflow.service;


import static java.lang.String.format;

import problems.job.custom.workflow.data.JobDAO;
import problems.job.custom.workflow.model.Job;


/**
 * Created by jitesh-kumar on 7/6/18.
 */
public class JobService {

  private JobDAO jobDAO = new JobDAO();

  public void add(Job job, String transitionOrders) {
    jobDAO.add(job, transitionOrders);
    System.out.println(format("Successfully added job with id %s and transition orders as %s", job.getId(), transitionOrders));
  }

  public void remove(Integer jobId) {
    jobDAO.remove(jobId);
    System.out.println(format("Successfully removed job with id %s .", jobId));
  }

}
