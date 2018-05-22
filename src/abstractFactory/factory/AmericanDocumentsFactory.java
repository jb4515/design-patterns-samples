package abstractFactory.factory;


import abstractFactory.factory.products.passport.AmericanPassport;
import abstractFactory.factory.products.passport.Passport;
import abstractFactory.factory.products.visa.AmericanVisa;
import abstractFactory.factory.products.visa.Visa;


/**
 * Created by jitesh-kumar on 22/5/18.
 */
public class AmericanDocumentsFactory implements DocumentsFactory {

  @Override public Passport getPassport() {
    return new AmericanPassport();
  }

  @Override public Visa getVisa() {
    return new AmericanVisa();
  }
}
