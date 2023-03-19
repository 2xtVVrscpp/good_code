package section12;

public class Price {

	public final int amount;
	private static final int MIN_AMOUNT = 0;

	/**
	 * @param amount
	 * @throws Exception
	 */
	public Price(int amount) throws Exception {
		if (amount < MIN_AMOUNT) {
			throw new Exception("amount is incorrect");
		}
		this.amount = amount;
	}

	/**
	 * bad example for return (using primitive type)
	 * 
	 * @param other
	 * @return priceAmount
	 */
	public int badAdd(final Price other) {
		return this.amount + other.amount;
	}

	/**
	 * good example for return (using explicit type)
	 * 
	 * @param other
	 * @return Price
	 * @throws Exception
	 */
	public Price goodAdd(final Price other) throws Exception {
		final int added = this.amount + other.amount;
		return new Price(added);
	}

}
