package abstractFactory.factory.products.visa;


/**
 * Created by jitesh-kumar on 22/5/18.
 */
public class AmericanVisa implements Visa {

  @Override public void printExpiryInDays() {
    System.out.println("The american visa usually expired in 90 days.");
  }
}
