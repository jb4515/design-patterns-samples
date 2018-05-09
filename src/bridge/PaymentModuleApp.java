/**
 * 19-Jun-2017
 */
package bridge;


/**
 * @author jitesh-kumar
 */
public class PaymentModuleApp {

  private static PaymentGateway hdfcGateway = new HdfcPaymentGateway();
  private static PaymentGateway sbiGateway = new SbiPaymentGateway();

  public static void main(String[] args) {
    PaymentModuleApp paymentModuleApp = new PaymentModuleApp();
    paymentModuleApp.receivePaymentForOrder();

    // if HDFC bank is not available then use SBI
//		hdfcGateway.setAvailability(false);

    System.out.println();
    System.out.println();
  }

  public void receivePaymentForOrder() {

    if (hdfcGateway.getAvailability()) {
      hdfcGateway.acceptPayment(PreferredGateway.NETBANKING);
    }
    else {
      sbiGateway.acceptPayment(PreferredGateway.CARD_PAYMENT);
    }

  }
}
