/**
 * 21-Jun-2017
 */
package facade;

/**
 * @author jitesh-kumar
 *
 */
public class HomeAutomationClient {

	public static void main(String[] args) {
		HomeAutomation homeAutomation = new HomeAutomationImpl();
		
		System.out.println(" *****  Want to cook food now . ******");
		homeAutomation.prepareKitchenForCooking();
		System.out.println();
		
		System.out.println("***** Let's watch Bahubali . *****");
		homeAutomation.prepareBedroomForMovie();
		System.out.println();
		
		
		System.out.println("*****   Time to get baby like sleep ***** ");
		homeAutomation.makeAdjustmentsForSleep();
		System.out.println();
	}
}
