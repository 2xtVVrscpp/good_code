package section6.sample6_4;

public class Money {
  final int _amount;       // amount
  final String _currency;  // currency


  
  public Money(final int amount, final String currency){
    if(amount < 0){
      throw new IllegalArgumentException("金額は0以上2<<31以下にしてください．");
    }
    if(currency == null){
      throw new IllegalArgumentException("通貨を指定してください．");
    }

    this._amount = amount;
    this._currency = currency;
  }

  
  
  void printMoney(){
    System.out.println("amount: " + this._amount + "(" + this._currency + ")");
  }

  Money add (final Money money){
    if(this._currency != money._currency){
      System.out.println("通貨が異なります．");
      return this;
    }
    try {
      return new Money(this._amount+money._amount, this._currency);
    } catch (IllegalArgumentException e) {
      //System.out.println(e.getMessage());
      return this;
    }
  }

  Money sub (final Money money){
    if(this._currency.equals(money._currency)){
      System.out.println("通貨が異なります．");
      return this;
    }
    try {
      return new Money(this._amount-money._amount, this._currency);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      return this;
    }
  }
}
