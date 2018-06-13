package state.interfaces;


/**
 * Created by jitesh-kumar on 10/5/18.
 */
/*
Interface to be extended
if any state is capable of performing its operation
without requiring input from any other state
 */
public interface IProcessWithoutInput {

  void process();
}
