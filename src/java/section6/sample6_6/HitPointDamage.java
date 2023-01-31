package section6.sample6_6;

public class HitPointDamage implements Damage{
	Member member = new Member();
	public void execute(final int damageAmount) {
		member.hitPoint -= damageAmount;
		if(0 < member.hitPoint) return;
		member.hitPoint = 0;
		member.states = "state";
	}

}
