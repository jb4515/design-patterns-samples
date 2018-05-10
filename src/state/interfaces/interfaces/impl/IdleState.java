package state.interfaces.interfaces.impl;


import java.util.InputMismatchException;
import java.util.Scanner;

import state.interfaces.INextStep;
import state.interfaces.IProcessWithoutInput;


/**
 * Created by jitesh-kumar on 10/5/18.
 */
public class IdleState implements INextStep, IProcessWithoutInput {

  @Override public void process() {
    System.out.println("Please enter money using coins.");
    System.out.println("Each soda items cost 10 dollars.");
    System.out.println("How many coins, do you want to insert? (Please enter valid number)");
    Scanner scanner = new Scanner(System.in);


    boolean isValidCountForCoins;
    int numberOfCoinsToBeInserted = 0;
    do {
      isValidCountForCoins = false;
      try {
        numberOfCoinsToBeInserted = scanner.nextInt();
        isValidCountForCoins = true;
      }
      catch (InputMismatchException e) {
        System.out.println("Please provide valid coins count!");
      }
    } while ((!isValidCountForCoins) || numberOfCoinsToBeInserted < 1);

    //for now just collecting coins that represent integers, will update to use float/double value as well.
    int totalMoneyCollected = 0;
    for (int i = 0; i < numberOfCoinsToBeInserted; i++) {
      System.out.println("Please enter value of coin");
      //can perform same checks for valid integer value as performed above, but skipping here for now
      //so expecting valid integer value for coins
      totalMoneyCollected += scanner.nextInt();
    }

    canDispenseSoda(totalMoneyCollected);
    //for simplicity assume we can just dispense one soda can, so will dispense rest of the money for now.
    dispenseExtraMoneyToCustomer(totalMoneyCollected);
    decideNextStep();
  }

  private void canDispenseSoda(final int totalMoneyCollected) {
    if (totalMoneyCollected < 10) {
      System.out.println("Could not dispense in less than 10 dollars, try again.");
      System.out.println();
      new DispenseMoneyState().process(totalMoneyCollected);
      new IdleState().process();
    }
  }

  @Override public void decideNextStep() {
    new DispenseSodaState().process();
  }

  private void dispenseExtraMoneyToCustomer(int totalMoneyCollected) {
    int balanceAfterDeductingMoneyForProduct = totalMoneyCollected - 10;
    if (balanceAfterDeductingMoneyForProduct > 0) {
      new DispenseMoneyState().process(totalMoneyCollected - 10);
    }
  }
}
