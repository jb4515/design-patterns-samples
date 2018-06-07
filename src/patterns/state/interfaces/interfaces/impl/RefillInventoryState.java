package patterns.state.interfaces.interfaces.impl;


import static patterns.state.Inventory.currentSodaItemsInStock;

import java.util.InputMismatchException;
import java.util.Scanner;

import patterns.state.interfaces.INextStep;
import patterns.state.interfaces.IProcessWithoutInput;


/**
 * Created by jitesh-kumar on 10/5/18.
 */

public class RefillInventoryState implements IProcessWithoutInput, INextStep {

  @Override public void process() {
    System.out.println("Enter stock count for soda (must be a number)");
    Scanner scanner = new Scanner(System.in);
    boolean receivedValidStockCount;
    int providedStockCount = 0;
    do {
      receivedValidStockCount = false;
      try {
        providedStockCount = scanner.nextInt();
        receivedValidStockCount = true;
      }
      catch (InputMismatchException e) {
        System.out.println("Please provide valid stock count!");
      }
    } while ((!receivedValidStockCount) || providedStockCount < 1);

    System.out.printf("Updated soda inventory to %d items.%n", currentSodaItemsInStock.addAndGet(providedStockCount));
    System.out.println("**********************");
    System.out.println();

    decideNextStep();
  }

  @Override public void decideNextStep() {
    new IdleState().process();
  }
}
