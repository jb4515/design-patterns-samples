package state.interfaces.interfaces.impl;


import state.Inventory;
import state.interfaces.INextStep;
import state.interfaces.IProcessWithoutInput;


/**
 * Created by jitesh-kumar on 10/5/18.
 */
public class DispenseSodaState implements INextStep, IProcessWithoutInput {

  @Override public void process() {
    Inventory.currentSodaItemsInStock.decrementAndGet();

    System.out.println("Dispensed your soda, please collect it.");
    System.out.println("**********************");
    System.out.println();

    decideNextStep();
  }

  @Override public void decideNextStep() {
    new VerifyInventoryState().process();
  }
}
