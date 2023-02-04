package lib;

public class SniperRiffle extends Weapon {
	public SniperRiffle(double damageAmount) {
		super(damageAmount);
	}

	@Override
	public void shoot() {
		System.out.printf("Sniper riffle shoots with ba-bah sound and dealing %.1f damage\n", this.getDamageAmount());
	}

}
