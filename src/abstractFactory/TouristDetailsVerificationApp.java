package abstractFactory;


import abstractFactory.factory.AmericanDocumentsFactory;
import abstractFactory.factory.IndianDocumentsFactory;


/**
 * Created by jitesh-kumar on 22/5/18.
 */
public class TouristDetailsVerificationApp {

  public static void main(String[] args) {
    DocumentsHandler documentsHandler = getAppicationContext("INDIA");  //country could come from UI selection/dropdown box
    documentsHandler.printTouristDetails();
  }

  //we could create a factory for this, but skipping it for simplicity now.
  private static DocumentsHandler getAppicationContext(String country) {
    DocumentsHandler documentsHandler = null;
    switch (country) {
      case "INDIA":
        documentsHandler = new DocumentsHandler(new IndianDocumentsFactory());
        break;
      case "AMERICA":
        documentsHandler = new DocumentsHandler(new AmericanDocumentsFactory());
        break;
    }
    return documentsHandler;
  }
}
