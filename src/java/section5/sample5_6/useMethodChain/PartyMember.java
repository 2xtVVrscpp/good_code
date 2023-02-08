package section5.sample5_6.useMethodChain;

public class PartyMember {
	int memberId;
	String armor;

	PartyMember members(int memberId) {
		this.memberId = memberId;
		return this;
	}

	PartyMember equipments(int memberId) {
		// 何装備しているのかを返す
		return this;
	}

	boolean canChange(int memberId) {
		// メンバーの装備が着脱可能か？
		return true;
	}

}
