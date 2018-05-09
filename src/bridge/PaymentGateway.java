/**
 * 19-Jun-2017
 */
package bridge;

/**
 * @author jitesh-kumar
 *
 */
public interface PaymentGateway {

	void acceptPayment(PreferredGateway gateway);
	
	void setAvailability(boolean available);
	
	boolean getAvailability();
}
