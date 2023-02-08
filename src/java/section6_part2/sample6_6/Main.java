package section6.sample6_6;

import java.util.Map;

public class Main {

	static Member member = new Member();

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int damageAmount = 50;
		//States state = new States();

		String state = "dead";
//StateType stateType = null;
//		state.add(stateType);
		damage(true, damageAmount,state);
		System.out.println(member.hitPoint);
		System.out.println(member.magicPoint);

		//damages = "";
		
		applyDamage(DamageType.magicPoint,damageAmount);
		System.out.println(member.hitPoint);
		System.out.println(member.magicPoint);
		
	}


	static void damage(boolean damageFlag, int damageAmount, String state) {
		if(damageFlag == true) {
			//ヒットポイントダメージ
			member.hitPoint -= damageAmount;
			if(0 < member.hitPoint) return;

			member.hitPoint = 0;
			member.states = state;

		}else {
			//魔法力ダメージ
			member.magicPoint -= damageAmount;
			if(0 < member.magicPoint) return;

			member.magicPoint = 0;
			member.states = state;

		}
	}
	static void isExecute(boolean damageFlag) {
		if(damageFlag == true) {
			//

		}else {
			//魔法力ダメージ

		}
	}
	
	enum DamageType {
		hitPoint,
		magicPoint
	};

	private static  Map<DamageType, Damage> damages;

	static void applyDamage(final DamageType damagetype, final int damageAmopunt) {
		final Damage damage = damages.get(damagetype);
		damage.execute(damageAmopunt);

	};

}
