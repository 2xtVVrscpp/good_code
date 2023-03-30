package section6_part2.sample6_6;

public class MagicPointDamage implements Damage{
	Member member = new Member();
	public void execute(final int damageAmount) {
		member.magicPoint -= damageAmount;
		if(0 < member.magicPoint) return;
		member.magicPoint = 0;
	}

}
