/**
 * 19-Jun-2017
 */
package bridge;


/**
 * @author jitesh-kumar
 */
public interface PaymentGateway {

  void acceptPayment(PreferredGateway gateway);
  boolean getAvailability();
  void setAvailability(boolean available);
}
