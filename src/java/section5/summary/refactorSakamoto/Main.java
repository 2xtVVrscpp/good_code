package section5.summary.refactorSakamoto;

public class Main {

	public static void main(String[] args) {
		// 開始ログを出力する
		Logger.printInfo("start process");

		// １冊目の本を定義する
		BookManager bookA = new BookManager("goodBook", 3000, 100);

		// ２冊目の本を定義する
		BookManager bookB = new BookManager("badBook", 6000, 10);

		// 売上高を初期化する
		int salesAmount = 0;

		// １人目の購入後の状況を出力する
		int buyNum1 = 2;
		bookA.afterSoldBookStored(buyNum1);
		bookA.printBookBuyNumInfo(buyNum1);
		salesAmount = bookA.calcSalesAmount(buyNum1, salesAmount);
		System.out.println("Sales Amount is " + salesAmount);

		System.out.println("\n");

		// ２人目の購入後の状況を出力する
		int buyNum2 = 10;
		bookA.afterSoldBookStored(buyNum2);
		bookA.printBookBuyNumInfo(buyNum2);
		salesAmount = bookA.calcSalesAmount(buyNum2, salesAmount);
		System.out.println("Sales Amount is " + salesAmount);

		// 終了ログを出力する
		Logger.printInfo("end process");

	}
}