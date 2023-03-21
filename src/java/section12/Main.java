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
			System.out.println("[bad ] after adding Price is " + afterPrice1);

			Price defaultPrice2 = new Price(defaultAmount);
			Price addPrice2 = new Price(defaultAmount);
			Price afterPrice2 = defaultPrice2.goodAdd(addPrice2);
			System.out.println("[good] after adding Price is " + afterPrice2.amount);

			Price defaultPrice3 = new Price(-1000); // throw exception
			defaultPrice3.goodAdd(new Price(10000)); // not processing.
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		System.out.println("================================");

		// *************************************
		// Not use DoubleMeaning
		// *************************************
		System.out.println("==== Not use DoubleMeaning =====");
		try {
			int initialX = 10;
			int initialY = 20;
			Location location = new Location(initialX, initialY);
			System.out.println("before (x, y) = (" + location.x + ", " + location.y + ")");
			Location afterLocation = location.shift(20, -10);
			System.out.println("after  (x, y) = (" + afterLocation.x + ", " + afterLocation.y + ")");

			Location errorLocation = location.shift(-10, -100); // throw exception
			System.out.println("after (x, y) = (" + errorLocation.x + ", " + errorLocation.y + ")");// not processing.
		} catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage());
		}
		System.out.println("================================");
	}

}
