/**
 * 19-Jun-2017
 */
package patterns.observer;


/**
 * @author jitesh-kumar
 */
public class ObserverPatternClient {

  public static void main(String[] args) {
    System.out.println("***** Demo for Observer pattern *****");
    System.out.println();

    SelectedSmartphone selectedSmartphone = new SelectedSmartphone();

    Customer customer = new Customer(selectedSmartphone);

    selectedSmartphone.setInStock(true);

  }

}
