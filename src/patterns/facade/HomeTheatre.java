/**
 * 21-Jun-2017
 */
package patterns.facade;


/**
 * @author jitesh-kumar
 */
public class HomeTheatre {

  public static void executeCommand(boolean toSwitchOn, String area) {
    if (toSwitchOn) {
      System.out.println(" #### Starting home theatre in " + area + " ####");
      System.out.println("Switched on speakers.");
      System.out.println("Switched on television.");
      System.out.println(" #### Home theatre is ready, enjoy !! ####");
    }
    else {
      System.out.println("Bye, bye.. Turning off home theatre in " + area + " ####");
    }
  }
}
