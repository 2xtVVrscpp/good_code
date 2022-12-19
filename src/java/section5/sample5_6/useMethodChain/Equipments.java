package section5.sample5_6.useMethodChain;

// この例もいまいちわからなかったので、コード完全に変えました。
// 分かる方いればぜひ書き換えお願いします。

public class Equipments {
	PartyMember party;

	/**
	 * 鎧を装備する
	 * 
	 * @param memberId 装備変更したいメンバーのid
	 * @param newArmor 装備する鎧
	 */
	void equipArmor(int memberId, String newArmor) {
		if (party.members(memberId).equipments().canChange()) {
			party.members(memberId).equipments().armor = newArmor;
		}
	}
}
