package abstractFactory.factory;


import abstractFactory.factory.products.passport.Passport;
import abstractFactory.factory.products.visa.Visa;


/**
 * Created by jitesh-kumar on 22/5/18.
 */
public interface DocumentsFactory {

  Passport getPassport();
  Visa getVisa();
}
