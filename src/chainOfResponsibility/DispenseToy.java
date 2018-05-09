/**
 * 21-Jun-2017
 */
package chainOfResponsibility;


/**
 * @author jitesh-kumar
 */
public class DispenseToy implements ToyFactoryChain {

  private ToyFactoryChain toyFactoryChain;

  @Override
  public void processToy() {
    System.out.println();
    System.out.println(" **** Dispensing toy for market.  ****");

    //USE IT AFTER ADDING FURTHER PROCESSORS
    //		this.toyFactoryChain.processToy();
  }

  @Override
  public void setNextChain(ToyFactoryChain toyFactoryChain) {
    this.toyFactoryChain = toyFactoryChain;
  }

}
