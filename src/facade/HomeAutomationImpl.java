/**
 * 21-Jun-2017
 */
package facade;

/**
 * @author jitesh-kumar
 *
 */
public class HomeAutomationImpl implements HomeAutomation{

	
	@Override
	public void prepareKitchenForCooking() {
		Lights.executeCommand(true, "Kitchen");
		AirConditioner.executeCommand(true, "Kitchen");
		BurningStove.executeCommand(true);
		
	}

	@Override
	public void prepareBedroomForMovie() {
		AirConditioner.executeCommand(true, "Bedroom");
		Lights.executeCommand(false, "Bedroom");
		HomeTheatre.executeCommand(true, "Bedroom");
		
	}

	@Override
	public void makeAdjustmentsForSleep() {
		Lights.executeCommand(false, "Kitchen");
		Lights.executeCommand(false, "Bedroom");
		HomeTheatre.executeCommand(false, "Bedroom");
		
	}

}
