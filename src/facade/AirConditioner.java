/**
 * 21-Jun-2017
 */
package facade;

/**
 * @author jitesh-kumar
 *
 */
public class AirConditioner {

	public static void executeCommand(boolean toSwitchOn, String area) {
		if (toSwitchOn) {
			System.out.println(" Temperature would be chilled for " + area + " in few minutes.");
		} else {
			System.out.println("Bye, bye.. Turning off air conditioner for " + area + ".");
		}
	}
}
