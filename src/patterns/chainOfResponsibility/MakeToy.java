/**
 * 21-Jun-2017
 */
package patterns.chainOfResponsibility;


/**
 * @author jitesh-kumar
 */
public class MakeToy implements ToyFactoryChain {

  private ToyFactoryChain toyFactoryChain;

  @Override
  public void processToy() {
    System.out.println();
    System.out.println(" **** Made beautiful toy for children  ****");
    this.toyFactoryChain.processToy();
  }

  @Override
  public void setNextChain(ToyFactoryChain toyFactoryChain) {
    this.toyFactoryChain = toyFactoryChain;
  }

}
