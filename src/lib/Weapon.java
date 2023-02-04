package lib;

public abstract class Weapon {
	private double damageAmount;
	
	public Weapon(double damageAmount){
		this.setDamageAmount(damageAmount);
	}
	public abstract void shoot();
	
	
	
	public double getDamageAmount() {
		return damageAmount;
	}
	public void setDamageAmount(double damageAmount) {
		this.damageAmount = damageAmount;
	}
}
