package section10.maxHitPoint;

public class Main {
	public static void main(String[] args) {
		OriginalMaxHitPoint originalMaxHitPoint = new OriginalMaxHitPoint(50);
		Accessory accessory = new Accessory(10);
		Armor armor = new Armor(20);
		Member member = new Member(originalMaxHitPoint, accessory, armor);

		member.showAbility();
	}
}
