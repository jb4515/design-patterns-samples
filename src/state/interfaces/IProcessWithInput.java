package state.interfaces;


/**
 * Created by jitesh-kumar on 10/5/18.
 */
/*
Interface to be extended
if any state requires input from any other state to perform its operation
 */
public interface IProcessWithInput<T> {

  void process(T input);
}
