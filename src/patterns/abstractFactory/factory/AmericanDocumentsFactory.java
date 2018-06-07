package patterns.abstractFactory.factory;


import patterns.abstractFactory.factory.products.passport.AmericanPassport;
import patterns.abstractFactory.factory.products.passport.Passport;
import patterns.abstractFactory.factory.products.visa.AmericanVisa;
import patterns.abstractFactory.factory.products.visa.Visa;


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
