package problems.job.custom.workflow;


import problems.job.custom.workflow.data.CandidateDAO;
import problems.job.custom.workflow.data.JobCandidateDAO;
import problems.job.custom.workflow.data.JobDAO;
import problems.job.custom.workflow.model.Candidate;
import problems.job.custom.workflow.model.Job;


/**
 * Created by jitesh-kumar on 8/6/18.
 */
public class Application {

  public static void main(String[] args) {
    JobDAO jobDAO = new JobDAO();
    CandidateDAO candidateDAO = new CandidateDAO();
    JobCandidateDAO jobCandidateDAO = new JobCandidateDAO();

    Job job1 = new Job(1, "Java Developer");
    Job job2 = new Job(2, "Python Developer");
    Job job3 = new Job(3, "SAP Technology Expert");

    Candidate candidate1 = new Candidate(1, "Mark", "Buffalo");
    Candidate candidate2 = new Candidate(2, "John", "Doe");
    Candidate candidate3 = new Candidate(3, "Sean", "Paul");
    Candidate candidate4 = new Candidate(4, "Sundar", "Pichai");
    Candidate candidate5 = new Candidate(5, "Bill", "Bloomberg");

    jobDAO.add(job1, "10 2 3 4 5");
    jobDAO.add(job2, "1 2 3 4 5 6 10");

  }
}
