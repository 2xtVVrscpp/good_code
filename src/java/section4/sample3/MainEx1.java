package section4.sample3;

class MainEx1 {
	public static void main(String[] args) {
		final AttackPower attackPowerA = new AttackPower(20);
		final AttackPower attackPowerB = new AttackPower(20);

		final Weapon weaponA = new Weapon(attackPowerA);
		final Weapon weaponB = new Weapon(attackPowerB);

		final AttackPower increment = new AttackPower(5);
		final Weapon reinForcedWeaponA = weaponA.reinForce(increment);

		System.out.println("Weapon A attack power : " + weaponA._attackPower._value);
		System.out.println("Reinforced weapon A attack power : " + reinForcedWeaponA._attackPower._value);
		System.out.println("Weapon B attack power : " + weaponB._attackPower._value);
	}
}
