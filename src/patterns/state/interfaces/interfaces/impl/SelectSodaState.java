package patterns.state.interfaces.interfaces.impl;


import patterns.state.interfaces.INextStep;
import patterns.state.interfaces.IProcessWithoutInput;


/**
 * Created by jitesh-kumar on 10/5/18.
 */
/*
  Has not been used for now, will use it to dispense different soda types in future
 */

public class SelectSodaState implements IProcessWithoutInput, INextStep {

  @Override public void process() {
    /*System.out.println("Please enter variety of soda, use A, B, C, one at a time.");
    Scanner scanner = new Scanner(System.in);
    boolean hasEnteredValidSodaType;
    do {
      hasEnteredValidSodaType = false;
      String sodaType = scanner.nextLine();
      if (isValidSoda(sodaType)) {
        hasEnteredValidSodaType = true;
      }
    } while (hasEnteredValidSodaType);*/

  }
/*
  private boolean isValidSoda(final String sodaType) {
    if (null == sodaType || sodaType.length() == 0) {
      return false;
    }
    return "A".equals(sodaType) ||
             "B".equals(sodaType) ||
             "C".equals(sodaType);
  }*/

  @Override public void decideNextStep() {

  }
}
