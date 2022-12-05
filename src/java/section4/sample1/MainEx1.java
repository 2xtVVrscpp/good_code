package section4.sample1;

public class MainEx1{
	public static void main(String[] args){
		AttackPower attackPower = new AttackPower(20);

		Weapon weaponA = new Weapon(attackPower);
		Weapon weaponB = new Weapon(attackPower);	//attackPowerを使いまわしている

		weaponA._attackPower._value = 25;

		System.out.println("Weapon A attack power : " + weaponA._attackPower._value);
		System.out.println("Weapon B attack power : " + weaponB._attackPower._value);
	}
}
