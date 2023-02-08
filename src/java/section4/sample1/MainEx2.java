package section4.sample1;

public class MainEx2{
	public static void main(String[] args){
		AttackPower attackPowerA = new AttackPower(20);
		AttackPower attackPowerB = new AttackPower(20);

		Weapon weaponA = new Weapon(attackPowerA);
		Weapon weaponB = new Weapon(attackPowerB);	//attackPowerを使いまわさない

		weaponA._attackPower._value += 5;

		System.out.println("Weapon A attack power : " + weaponA._attackPower._value);
		System.out.println("Weapon B attack power : " + weaponB._attackPower._value);
	}
}
