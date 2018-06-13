package abstractFactory.factory;


import abstractFactory.factory.products.passport.IndianPassport;
import abstractFactory.factory.products.passport.Passport;
import abstractFactory.factory.products.visa.IndianVisa;
import abstractFactory.factory.products.visa.Visa;


/**
 * Created by jitesh-kumar on 22/5/18.
 */
public class IndianDocumentsFactory implements DocumentsFactory {

  @Override public Passport getPassport() {
    return new IndianPassport();
  }

  @Override public Visa getVisa() {
    return new IndianVisa();
  }
}
