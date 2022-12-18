package section5.sample5_4.goodActorManager;

public class Main {
	public static void main(String[] args) {
		Location location = new Location(0, 0);
		System.out.println("x " + location.x + " y " + location.y);
		location.shift(10, 15);
		System.out.println("x " + location.x + " y " + location.y);
		location.shift(10, 15);
		System.out.println("x " + location.x + " y " + location.y);
	}
}
