package section3;

public class Money {
  final int amount;       // amount
  final String currency;  // currency

  Money(final int amount, final String currency){
    if(amount < 0){
      throw new IllegalArgumentException("金額は0以上2<<31以下にしてください．");
    }
    if(currency == null){
      throw new IllegalArgumentException("通貨を指定してください．");
    }

    this.amount = amount;
    this.currency = currency;
  }

  void printMoney(){
    System.out.println("amount: " + this.amount + "(" + this.currency + ")");
  }

  Money add (final Money money){
    if(this.currency != money.currency){
      System.out.println("通貨が異なります．");
      return this;
    }
    try {
      return new Money(this.amount+money.amount, this.currency);
    } catch (IllegalArgumentException e) {
      //System.out.println(e.getMessage());
      return this;
    }
  }

  Money sub (final Money money){
    if(this.currency.equals(money.currency)){
      System.out.println("通貨が異なります．");
      return this;
    }
    try {
      return new Money(this.amount-money.amount, this.currency);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      return this;
    }
  }
}
