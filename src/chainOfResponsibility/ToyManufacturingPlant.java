/**
 * 21-Jun-2017
 */
package chainOfResponsibility;

/**
 * @author jitesh-kumar
 *
 */
public class ToyManufacturingPlant {

	private ToyFactoryChain toyFactoryStarter;
	
	public ToyManufacturingPlant() {
		this.toyFactoryStarter = new PreparePlastic();
		MakeToy makeToyProcessor = new MakeToy();
		DispenseToy dispenseToyProcessor = new DispenseToy();
		
		toyFactoryStarter.setNextChain(makeToyProcessor);
		makeToyProcessor.setNextChain(dispenseToyProcessor);
		
	}

	public static void main(String[] args) {
		ToyManufacturingPlant manufacturingPlant = new ToyManufacturingPlant();
		manufacturingPlant.toyFactoryStarter.processToy();
	}
}
