/**
 * 19-Jun-2017
 */
package bridge;

/**
 * @author jitesh-kumar
 *
 */
public class HdfcNetbanking implements HdfcPaymentModule {

	@Override
	public void receiveThroughHdfc() {
		System.out.println("Received through Hdfc Net banking service.");
		processAfterPayment();
	}
}
