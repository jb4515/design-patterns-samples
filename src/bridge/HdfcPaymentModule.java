/**
 * 19-Jun-2017
 */
package bridge;


/**
 * @author jitesh-kumar
 */
public interface HdfcPaymentModule {

  ReceiptPrinter receiptPrinter = new ReceiptPrinter();

  void receiveThroughHdfc();

  default void processAfterPayment() {
    System.out.println();
    System.out.println(" **** Printing Acknowledgement **** ");
    receiptPrinter.acknowledgePayment();
    System.out.println();
    System.out.println(" -> ORDER CONFIRMED.");
  }
}
