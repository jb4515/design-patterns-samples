/**
 * 21-Jun-2017
 */
package chainOfResponsibility;


/**
 * @author jitesh-kumar
 */
public class ToyManufacturingPlantApp {

  private ToyFactoryChain toyFactoryStarter;

  public ToyManufacturingPlantApp() {
    this.toyFactoryStarter = new PreparePlastic();
    MakeToy makeToyProcessor = new MakeToy();
    DispenseToy dispenseToyProcessor = new DispenseToy();

    toyFactoryStarter.setNextChain(makeToyProcessor);
    makeToyProcessor.setNextChain(dispenseToyProcessor);

  }

  public static void main(String[] args) {
    ToyManufacturingPlantApp manufacturingPlant = new ToyManufacturingPlantApp();
    manufacturingPlant.toyFactoryStarter.processToy();
  }
}
