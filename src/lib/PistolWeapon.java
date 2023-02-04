package lib;

public class PistolWeapon extends Weapon {

	public PistolWeapon(double damageAmount) {
		super(damageAmount);
	}

	@Override
	public void shoot() {
		System.out.printf("Pistol shoots with piu-piu sound and dealing %.1f damage\n", this.getDamageAmount());
	}
}
