/**
 * 21-Jun-2017
 */
package facade;

/**
 * @author jitesh-kumar
 *
 */
public class Lights {

	public static void executeCommand(boolean toSwitchOn, String area) {
		if (toSwitchOn) {
			System.out.println(" Turning on lights for " + area + ".");
		} else {
			System.out.println("Bye, bye.. Turning off lights for " + area + ".");
		}

	}
}
