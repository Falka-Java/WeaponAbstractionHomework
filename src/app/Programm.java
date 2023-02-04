package app;

import lib.*;
public class Programm {

	public static void main(String[] args) {
		Weapon[] weapons = {
				new PistolWeapon(5.3),
				new AutomaticRiffle(10.3),
				new SniperRiffle(50.5)
		};
		
		for(Weapon w : weapons) {
			w.shoot();
		}

	}

}
