package patterns.abstractFactory.factory.products.visa;


/**
 * Created by jitesh-kumar on 22/5/18.
 */
public class IndianVisa implements Visa {

  @Override public void printExpiryInDays() {
    System.out.println("The Indian visa usually expired in 180 days.");
  }
}
