package patterns.state.interfaces.interfaces.impl;


import static patterns.state.Inventory.currentSodaItemsInStock;

import patterns.state.interfaces.INextStep;
import patterns.state.interfaces.IProcessWithoutInput;


/**
 * Created by jitesh-kumar on 10/5/18.
 */
public class VerifyInventoryState implements IProcessWithoutInput, INextStep {


  @Override public void process() {
    decideNextStep();
  }

  @Override public void decideNextStep() {
    switch (currentSodaItemsInStock.get()) {
      case 0:
        new RefillInventoryState().process();
      default:
        new IdleState().process();
        //TODO add some other cases for filling inventory in advance
    }
  }
}
