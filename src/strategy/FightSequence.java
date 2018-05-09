/**
 * 21-Jun-2017
 */
package strategy;

/**
 * @author jitesh-kumar
 *
 */
public class FightSequence {

	private FightingWeapon fightingWeapon;

	public FightSequence() {
		super();
		this.fightingWeapon = new SwordWeapon();
	}

	public void setFightingWeapon(FightingWeapon fightingWeapon) {
		this.fightingWeapon = fightingWeapon;
	}

	public static void main(String[] args) {
		FightSequence fightSequence = new FightSequence();

		fightSequence.fightingWeapon.fightOpponent();

		System.out.println();
		System.out.println(" Now I want to fight in realxed way :) Give me some other weapon .");
		System.out.println();
		fightSequence.setFightingWeapon(new CrossBowWeapon());

		fightSequence.fightingWeapon.fightOpponent();

	}
}
