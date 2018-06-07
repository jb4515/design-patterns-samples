/**
 * 21-Jun-2017
 */
package patterns.chainOfResponsibility;


/**
 * @author jitesh-kumar
 */
public class PreparePlastic implements ToyFactoryChain {

  private ToyFactoryChain toyFactoryChain;

  @Override
  public void processToy() {

    System.out.println(" **** Prepared plastic for toy  ****");
    this.toyFactoryChain.processToy();
  }

  @Override
  public void setNextChain(ToyFactoryChain toyFactoryChain) {
    this.toyFactoryChain = toyFactoryChain;
  }

}
