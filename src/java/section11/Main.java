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
		Currency _yen = Currency.getInstance(Locale.JAPAN);
		Money _money1 = new Money(1000, _yen);
		Money _money2 = new Money(100, _yen);
		Money _moneyFinaly = _money1.add(_money2);
		System.out.println(_moneyFinaly.amount);
	}
}
