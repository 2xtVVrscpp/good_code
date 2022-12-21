package section5.sample5_6.useMethodChain;

// この例もいまいちわからなかったので、コード完全に変えました。
// 分かる方いればぜひ書き換えお願いします。

public class Equipments {
	// そもそも装備品クラスがメンバーを持っているのがおかしいのでは？ということっぽい
	// メソッドチェインが、というよりは責務をしっかり分けていないため
	// 無理やり呼び出そうとしているのが問題
	PartyMember party;

	Equipments() {
		party = new PartyMember();
	}

	/**
	 * 鎧を装備する
	 * 
	 * @param memberId 装備変更したいメンバーのid
	 * @param newArmor 装備する鎧
	 */
	void equipArmor(int memberId, String newArmor) {
		// 本の原文
		// if (party.members[memberId].equipments.canChange) {
		// party.members[memberId].equipments.armor = newArmor;
		// }
		if (party.members(memberId).equipments(memberId).canChange(memberId)) {
			party.members(memberId).equipments(memberId).armor = newArmor;
		}
	}
}