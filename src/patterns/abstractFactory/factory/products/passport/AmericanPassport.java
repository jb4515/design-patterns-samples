package patterns.abstractFactory.factory.products.passport;


/**
 * Created by jitesh-kumar on 22/5/18.
 */
public class AmericanPassport implements Passport {

  @Override public void printIssuingCountry() {
    System.out.println("The passport has been issued by The United State of America.");
  }
}