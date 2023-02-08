package section5.sample5_4.goodActorManager;

public class Main {
	public static void main(String[] args) {
		Location location = new Location(0, 0);
		System.out.println("x " + location.x + " y " + location.y);
		Location location1 = location.shift(10, 15);
		System.out.println("x " + location1.x + " y " + location1.y);

		Location location2 = location1.shift(10, 15);
		System.out.println("x " + location2.x + " y " + location2.y);

		// location/location1はそのままの値
		System.out.println("x " + location.x + " y " + location.y);
		System.out.println("x " + location1.x + " y " + location1.y);

		// image
		// Hiro.move(10,10);
	}
}

// class Hiro{
// private Location location;

// void move(int x, int y){
// location = location.shift(x, y);
// System.out.println("x " + location.x + " y " + location.y);
// }
// }