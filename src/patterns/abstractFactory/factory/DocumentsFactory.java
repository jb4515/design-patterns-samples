package patterns.abstractFactory.factory;


import patterns.abstractFactory.factory.products.passport.Passport;
import patterns.abstractFactory.factory.products.visa.Visa;


/**
 * Created by jitesh-kumar on 22/5/18.
 */
public interface DocumentsFactory {

  Passport getPassport();
  Visa getVisa();
}
