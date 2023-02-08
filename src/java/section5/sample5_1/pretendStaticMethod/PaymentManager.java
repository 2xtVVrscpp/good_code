package section5.sample5_1.pretendStaticMethod;

import java.security.Principal;

// list 5.2 
class PaymentManager {
	// 例では書かれているけど、Warning出るのでコメントアウトしておく
	public int _discountRate;
	// static public int _discountRate = 0; // staticを付けるとstaticメソッドの中でも使える

	PaymentManager() {
		System.out.println("constract");
		this._discountRate = -10;
	}

	// 5.1 OrderManagerと同じ内容。staticがなくなっただけ。
	public int add(final int moneyAmount1, final int monerAmount2) {
		return moneyAmount1 + monerAmount2;
	}

	// 5.1 の内容を記載
	static public int addExStatic(final int moneyAmount1, final int monerAmount2) {
		// インスタンス変数を呼び出そうとしてみるためのコメント
		// _discountRate = 10;
		return moneyAmount1 + monerAmount2;
	}
}