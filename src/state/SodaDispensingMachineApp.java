package state;


import state.interfaces.interfaces.impl.VerifyInventoryState;


/**
 * Created by jitesh-kumar on 10/5/18.
 */
public class SodaDispensingMachineApp {

  public static void main(String[] args) {
    System.out.println("***** Welcome to Soda Dispensing Machine *****");
    System.out.println();
    new VerifyInventoryState().process();
  }

}
