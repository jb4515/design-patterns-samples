/**
 * 21-Jun-2017
 */
package facade;

/**
 * @author jitesh-kumar
 *
 */
public class BurningStove {

	public static void executeCommand(boolean toSwitchOn) {
		if (toSwitchOn) {
			System.out.println(" Switching on burning stove.");
		} else {
			System.out.println("Bye, bye.. Turning off burning stove.");
		}
	}
}
