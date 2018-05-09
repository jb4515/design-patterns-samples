/**
 * 21-Jun-2017
 */
package strategy;


/**
 * @author jitesh-kumar
 */
public class FightSequenceApp {

  private FightingWeapon fightingWeapon;

  public FightSequenceApp(FightingWeapon fightingWeapon) {
    super();
    this.fightingWeapon = fightingWeapon;
  }

  public static void main(String[] args) {
    FightSequenceApp fightSequence = new FightSequenceApp(new SwordWeapon());

    fightSequence.fightingWeapon.fightOpponent();

    System.out.println();
    System.out.println(" Now I want to fight in relaxed way :) Give me some other weapon .");
    System.out.println();
    fightSequence.setFightingWeapon(new CrossBowWeapon());

    fightSequence.fightingWeapon.fightOpponent();

  }

  public void setFightingWeapon(FightingWeapon fightingWeapon) {
    this.fightingWeapon = fightingWeapon;
  }
}
