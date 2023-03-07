package section10.maxHitPoint;

public class Main {
	public static void main(String[] args) {
		OriginalMaxHitPoint originalMaxHitPoint = new OriginalMaxHitPoint(50);
		Accessory accessory = new Accessory(10);
		Armor armor = new Armor(20);

		Member member = new Member(originalMaxHitPoint, accessory, armor);
		member.showAbility();

		// 最大HPを+40させるアクセサリーに装備変更
		Accessory accessory2 = new Accessory(40);
		member.equip(accessory2);
		member.showAbility();

		// 最大HPを+60させる胸防具に装備変更
		Armor armor2 = new Armor(60);
		member.equip(armor2);
		member.showAbility();
	}
}
