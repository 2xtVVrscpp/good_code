package section5.sample5_6.useMethodChain;

public class PartyMember {
	int memberId;
	String armor;

	PartyMember members(int memberId) {
		this.memberId = memberId;
		return this;
	}

	PartyMember equipments() {
		return this;
	}

	boolean canChange() {
		return true;

	}

}
