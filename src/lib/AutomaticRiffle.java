package lib;

public class AutomaticRiffle extends Weapon{
	public AutomaticRiffle(double damageAmount) {
		super(damageAmount);
	}

	@Override
	public void shoot() {
		System.out.printf("Automatic riffle shoots with tra-ta-ta sound and dealing %.1f damage\n", this.getDamageAmount());
	}
}
