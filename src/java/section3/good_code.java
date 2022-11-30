package section3;

public class good_code {
  public static void main(String[] args){
    Money currency_ja = new Money(0, "EN");
    currency_ja.printMoney();

    currency_ja = currency_ja.add(new Money(10000, "EN"));
    currency_ja.printMoney();
    currency_ja = currency_ja.add(new Money(10000, "EURO"));
    currency_ja.printMoney();
    currency_ja = currency_ja.add(new Money(-10, "EN"));
    currency_ja.printMoney();

  }
}
