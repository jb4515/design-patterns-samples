/**
 * 19-Jun-2017
 */
package patterns.observer;


/**
 * @author jitesh-kumar
 */
public interface Observable {

  void addObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObservers();

}
