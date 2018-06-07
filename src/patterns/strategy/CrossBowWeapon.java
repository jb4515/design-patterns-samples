/**
 * 21-Jun-2017
 */
package patterns.strategy;


/**
 * @author jitesh-kumar
 */
public class CrossBowWeapon implements FightingWeapon {

  @Override
  public void fightOpponent() {
    System.out.println(" WOW !!! I have a cross bow to fight now. Did they know this? ");
  }

}
