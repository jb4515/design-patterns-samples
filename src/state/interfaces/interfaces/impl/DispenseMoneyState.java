package state.interfaces.interfaces.impl;


import state.interfaces.IProcessWithInput;


/**
 * Created by jitesh-kumar on 10/5/18.
 */
public class DispenseMoneyState implements IProcessWithInput<Integer> {


  @Override public void process(final Integer balanceMoney) {

    System.out.println("Dispensed " + balanceMoney + " dollars, please collect it.");
    System.out.println("**********************");
    System.out.println();
  }
}
