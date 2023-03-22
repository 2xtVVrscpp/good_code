package section11;

import java.util.Currency;
import java.util.Locale;

public class Main {

	/**
	 * 通貨を設定し、合計を出力するMainです。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Currency yen = Currency.getInstance(Locale.JAPAN);
		Money money1 = new Money(1000, yen);
		Money money2 = new Money(100, yen);
		Money moneyFinaly = money1.add(money2);
		System.out.println(moneyFinaly.amount);
	}
}
