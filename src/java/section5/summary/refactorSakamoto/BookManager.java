package section5.summary.refactorSakamoto;

public class BookManager {
	private String _bookName;
	private int _bookPrice;
	private int _bookStored;

	/**
	 * @param bookName
	 * @param bookPrice
	 * @param bookStored
	 */
	BookManager(final String bookName, final int bookPrice, final int bookStored) {
		if (bookName == "") {
			Logger.printError("bookName set error");
			System.exit(1);
		}
		if (bookPrice < 0) {
			Logger.printError("bookPrice set error");
			System.exit(1);
		}
		if (bookStored < 0) {
			Logger.printError("bookStored set error");
			System.exit(1);
		}

		this._bookName = bookName;
		this._bookPrice = bookPrice;
		this._bookStored = bookStored;
	}

	BookManager afterSoldBookStored(final int buyNum) {
		final int canBuyNum = this.bookNumCanBuy(buyNum);
		final int afterBuyNum = this._bookStored - canBuyNum;
		return new BookManager(
				this._bookName,
				this._bookPrice,
				afterBuyNum);
	}

	private int bookNumCanBuy(final int wantBuyNum) {
		if (wantBuyNum > this._bookStored) {
			return wantBuyNum;
		}
		return this._bookStored;
	}

	void printBookBuyNumInfo(final int buyNum) {
		System.out.println(buyNum + " " + this._bookName + " sold out");
	}

	void printBookStoredInfo() {
		System.out.println(this._bookName + " is stored " + this._bookStored);
	}

	int calcSalesAmount(final int buyNum, final int currentAmount) {
		return currentAmount + this._bookPrice * buyNum;
	}

}
