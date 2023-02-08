package section4.sample4;

public class MainEx1 {
	public static void main(String[] args) {
		Member member1 = new Member();
		member1.showMember();

		member1.damage(50);
		member1.showMember();

		member1.damage(70);	//適切に処理をしないと-20となるが、、、
		member1.showMember();
	}
}
