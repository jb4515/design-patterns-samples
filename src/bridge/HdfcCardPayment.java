/**
 * 19-Jun-2017
 */
package bridge;


/**
 * @author jitesh-kumar
 */
public class HdfcCardPayment implements HdfcPaymentModule {

  @Override
  public void receiveThroughHdfc() {
    System.out.println("Received amount through card payment service.");
    processAfterPayment();
  }

}
