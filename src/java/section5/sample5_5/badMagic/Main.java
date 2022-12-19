package section5.sample5_5.badMagic;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		RecoverMagicPointMethod magic = new RecoverMagicPointMethod();
		int currentMagicPoint = 100;
		int originalMaxMagicPoint = 200;
		int recoveryAmount = 20;
		// 服・帽子・盾でそれぞれ、１，２，３ずつ増加する効果があるとする。
		List<Integer> maxMagicPointIncrements = Arrays.asList(1, 2, 3);

		System.out.println("current : " + currentMagicPoint);

		int afterMagicPoint = magic.recoverMagicPoint(
				currentMagicPoint,
				originalMaxMagicPoint,
				maxMagicPointIncrements,
				recoveryAmount);

		System.out.println("after : " + afterMagicPoint);
	}
}
