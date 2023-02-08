package section5.sample5_1.pretendStaticMethod;

class Main {

	public static void main(String[] args) {

		// データ保持は‘MoneyData‘というデータクラス。
		MoneyData moneyData1 = new MoneyData();
		MoneyData moneyData2 = new MoneyData();
		moneyData1.amount = 10;
		moneyData2.amount = 100;

		// 計算ロジックは‘OrderManager‘クラス。
		// 5.1からここだけ変わった。インスタンス生成をしてから呼び出し。
		// ただし、5.1と結果は変わらない（データとロジックが別々に保持されている状況は変わらない）
		// System.out.println(PaymentManager._discountRate);
		PaymentManager paymentManager = new PaymentManager();
		moneyData1.amount = paymentManager.add(moneyData1.amount, moneyData2.amount);

		System.out.println(moneyData1.amount);

	}
}