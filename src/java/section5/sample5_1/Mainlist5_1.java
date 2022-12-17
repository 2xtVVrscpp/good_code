package section5.sample5_1;

class Mainlist5_1 {
	public static void main(String[] args) {
		MoneyData moneyData1 = new MoneyData();
		MoneyData moneyData2 = new MoneyData();
		moneyData1.amount = 10;
		moneyData2.amount = 100;

		// OrderManagerはオブジェクト化せずとも使えている状態。
		moneyData1.amount = OrderManager.add(moneyData1.amount, moneyData2.amount);

		System.out.println(moneyData1.amount);

	}
}