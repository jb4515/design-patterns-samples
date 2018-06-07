package patterns.state.interfaces;


/**
 * Created by jitesh-kumar on 10/5/18.
 */
/*
Interface to be extended
if any patterns.state is capable of performing its operation
without requiring input from any other patterns.state
 */
public interface IProcessWithoutInput {

  void process();
}
