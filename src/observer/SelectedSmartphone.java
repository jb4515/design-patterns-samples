/**
 * 19-Jun-2017
 */
package observer;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


/**
 * @author jitesh-kumar
 */
public class SelectedSmartphone implements Observable {

  private List<Observer> interestedCustomers = new CopyOnWriteArrayList<>();
  private boolean inStock = false;

  public void setInStock(boolean inStock) {
    this.inStock = inStock;
    notifyObservers();
  }

  @Override
  public void addObserver(Observer observer) {
    interestedCustomers.add(observer);

  }

  @Override
  public void removeObserver(Observer observer) {
    interestedCustomers.remove(observer);

  }

  @Override
  public void notifyObservers() {
    // notify all interested buyers that item is in stock
    interestedCustomers.parallelStream().forEach(observer -> observer.update());

  }

}
