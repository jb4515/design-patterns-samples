package patterns.state.interfaces;


/**
 * Created by jitesh-kumar on 10/5/18.
 */
/*
Interface to be extended
if any patterns.state requires input from any other patterns.state to perform its operation
 */
public interface IProcessWithInput<T> {

  void process(T input);
}
