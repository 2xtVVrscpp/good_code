package section12;

public class Main {

	public static void main(String[] args) {

		// *************************************
		// Command Query Separation
		// *************************************
		System.out.println("==== Command Query Separation =====");
		int defaultPoint = 10;
		// modifire
		CommandQuery commandQuery1 = new CommandQuery(defaultPoint);
		int badPoint = commandQuery1.gainAndGetPoint();
		System.out.println("modifire point is " + badPoint);

		// command and query
		CommandQuery commandQuery2 = new CommandQuery(defaultPoint);
		commandQuery2.gainPoint();
		int goodPoint = commandQuery2.getPoint();
		System.out.println("command and query point is " + goodPoint);

		System.out.println("===================================");

		// *************************************
		// Return explicit type
		// *************************************
		System.out.println("==== Return explicit type =====");
		int defaultAmount = 1000;
		try {
			Price defaultPrice1 = new Price(defaultAmount);
			Price addPrice1 = new Price(defaultAmount);
			int afterPrice1 = defaultPrice1.badAdd(addPrice1);
			System.out.println("[bad] after adding Price is " + afterPrice1);

			Price defaultPrice2 = new Price(defaultAmount);
			Price addPrice2 = new Price(defaultAmount);
			Price afterPrice2 = defaultPrice2.goodAdd(addPrice2);
			System.out.println("[good] after adding Price is " + afterPrice2.amount);

			Price defaultPrice3 = new Price(-1000); // throw exception
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		System.out.println("================================");
	}

}
