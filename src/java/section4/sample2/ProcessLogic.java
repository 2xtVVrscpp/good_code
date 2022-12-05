package section4.sample2;

class ProcessLogic {
	void methodV1() {
		AttackPower attackPower = new AttackPower(20);
		// 中略
		attackPower.reinForce(15);
		System.out.println("attack power : " + attackPower._value);
	}

	void methodV2(AttackPower attackPower) {
		// 別のスレッド処理
		attackPower.disable();
	}
}
