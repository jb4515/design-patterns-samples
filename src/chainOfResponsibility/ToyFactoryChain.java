/**
 * 21-Jun-2017
 */
package chainOfResponsibility;


/**
 * @author jitesh-kumar
 */
public interface ToyFactoryChain {

  void processToy();

  void setNextChain(ToyFactoryChain toyFactoryChain);
}
