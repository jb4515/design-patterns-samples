package problems.job.custom.workflow.model;


/**
 * Created by jitesh-kumar on 7/6/18.
 */
public class Candidate {

  private Integer id;
  private String firstname;
  private String lastname;

  //TODO write hashcode and equals


  public Candidate(final Integer id, final String firstname, final String lastname) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
  }

  public Integer getId() {
    return id;
  }

  public void setId(final Integer id) {
    this.id = id;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(final String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(final String lastname) {
    this.lastname = lastname;
  }
}
