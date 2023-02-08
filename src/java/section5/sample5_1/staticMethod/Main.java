package section5.sample5_1.staticMethod;

class Main {
	public static void main(String[] args) {

		// データ保持は‘MoneyData‘というデータクラス。
		MoneyData moneyData1 = new MoneyData();
		MoneyData moneyData2 = new MoneyData();
		moneyData1.amount = 10;
		moneyData2.amount = 100;

		// 計算ロジックは‘OrderManager‘クラス。さらに今回は staticメソッドとなっている。
		// OrderManagerはインスタンス生成せずとも使えている状態。
		moneyData1.amount = OrderManager.add(moneyData1.amount, moneyData2.amount);

		System.out.println(moneyData1.amount);

	}
}