package section5.summary.refactorSakamoto;

public class Main {

	public static void main(String[] args) {
		// 開始ログを出力する
		Logger.printInfo("start process");

		// １冊目の本を定義する
		String bookA = "goodBook";
		int bookAPrice = 3000;
		int bookAStored = 100;

		// ２冊目の本を定義する
		String bookB = "badBook";
		int bookBPrice = 6000;
		int bookBStored = 10;

		// 売上高を初期化する
		int salesAmount = 0;

		// １人目の購入後の状況を出力する
		int buyNum1 = 2;
		System.out.println(buyNum1 + " " + bookA + " sold out");
		salesAmount += bookAPrice * buyNum1;
		bookAStored -= buyNum1;
		System.out.println(bookA + " is stored " + bookAStored);
		System.out.println("Sales Amount is " + salesAmount);

		System.out.println("\n");

		// ２人目の購入後の状況を出力する
		int buyNum2 = 10;
		System.out.println(buyNum2 + " " + bookB + " sold out");
		salesAmount += bookBPrice * buyNum2;
		bookBStored -= buyNum2;
		System.out.println(bookB + " is stored " + bookBStored);
		System.out.println("Sales Amount is " + salesAmount);

		// 終了ログを出力する
		Logger.printInfo("end process");

	}
}
/*
 * public class StockManagement {
 * String _bookName;
 * int _bookPrice;
 * int _stockNum;
 * int _salesAmount;
 * 
 * StockManagement(String bookName, int bookPrice) {
 * if (bookName == "") {
 * System.out.println("Error : not input bookname \n");
 * System.exit(0);
 * }
 * if (bookPrice < 0) {
 * System.out.println("Error : price is more than 0 \n");
 * System.exit(0);
 * }
 * this._bookName = bookName;
 * this._bookPrice = bookPrice;
 * }
 * 
 * // 購入できるか
 * 
 * // 売上高の計算
 * // 残りの冊数
 * }
 * 
 * public class Logger {
 * 
 * }
 */