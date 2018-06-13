/**
 * 19-Jun-2017
 */
package bridge;


/**
 * @author jitesh-kumar
 */
public class SbiPaymentGateway implements PaymentGateway {

  private boolean availability = true;

  @Override
  public void acceptPayment(PreferredGateway gateway) {
    System.out.println("**** We will be accepting payment through SBI bank now. ****");
  }

  @Override
  public boolean getAvailability() {
    return this.availability;
  }

  @Override
  public void setAvailability(boolean availability) {
    this.availability = availability;
  }

}
