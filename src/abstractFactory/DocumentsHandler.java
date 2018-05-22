package abstractFactory;


import abstractFactory.factory.DocumentsFactory;
import abstractFactory.factory.products.passport.Passport;
import abstractFactory.factory.products.visa.Visa;


/**
 * Created by jitesh-kumar on 22/5/18.
 */
public class DocumentsHandler {

  private Passport passport;
  private Visa visa;

  public DocumentsHandler(DocumentsFactory documentsFactory) {
    this.passport = documentsFactory.getPassport();
    this.visa = documentsFactory.getVisa();
  }

  public void printTouristDetails() {
    passport.printIssuingCountry();
    visa.printExpiryInDays();
  }
}
