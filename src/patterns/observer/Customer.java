/**
 * 19-Jun-2017
 */
package patterns.observer;


/**
 * @author jitesh-kumar
 */
public class Customer implements Observer {

  private Observable observable = null;

  public Customer(Observable observable) {
    super();
    this.observable = observable;
    this.observable.addObserver(this);
    System.out.println("Subscribed to smartphone stock notifications.");
    System.out.println();
  }

  @Override
  public void update() {
    buyItem();
    // don't need to receive notifications for this product
    unsubscribeNow();
    System.out.println("Notifications not needed now , succesfully unsubscribed.");
  }

  private void buyItem() {
    System.out.println(" Bought my favourite smartphone, Yupiie :) :) ");
    System.out.println();
  }

  private void unsubscribeNow() {
    observable.removeObserver(this);
  }

}
