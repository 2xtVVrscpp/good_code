package section5.sample5_5.goodMagic;

public class Main {
	public static void main(String[] args) {
		MagicPoint magic = new MagicPoint();
		int recoveryAmount = 20;

		System.out.println(magic.current());
		magic.recover(recoveryAmount);
		System.out.println(magic.current());
	}
}
