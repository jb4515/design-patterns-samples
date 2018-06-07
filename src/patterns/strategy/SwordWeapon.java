/**
 * 21-Jun-2017
 */
package patterns.strategy;


/**
 * @author jitesh-kumar
 */
public class SwordWeapon implements FightingWeapon {


  @Override
  public void fightOpponent() {
    System.out.println(" ### Fighting sword fight right now. ### ");

  }

}
