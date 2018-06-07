/**
 * 19-Jun-2017
 */
package patterns.bridge;


/**
 * @author jitesh-kumar
 */
public class HdfcPaymentGateway implements PaymentGateway {

  private boolean availability = true;
  private HdfcPaymentModule hdfcPaymentModule;

  @Override
  public void acceptPayment(PreferredGateway gateway) {
    switch (gateway) {
      case NETBANKING:
        hdfcPaymentModule = new HdfcNetbanking();
        hdfcPaymentModule.receiveThroughHdfc();
        break;
      case CARD_PAYMENT:
        hdfcPaymentModule = new HdfcCardPayment();
        hdfcPaymentModule.receiveThroughHdfc();
        break;
      default:
        break;
    }
  }

  @Override
  public boolean getAvailability() {
    return this.availability;

  }

  //could be a health check service here.
  @Override
  public void setAvailability(boolean availability) {
    this.availability = availability;

  }
}
