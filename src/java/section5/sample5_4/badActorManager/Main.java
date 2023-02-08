package section5.sample5_4.badActorManager;

public class Main {
	public static void main(String[] args) {
		ActorManager actorManager = new ActorManager();
		Location location = new Location();
		System.out.println("x " + location.x + " y " + location.y);
		actorManager.shift(location, 10, 15);
		System.out.println("x " + location.x + " y " + location.y);
		actorManager.shift(location, 10, 15);
		System.out.println("x " + location.x + " y " + location.y);
	}
}
