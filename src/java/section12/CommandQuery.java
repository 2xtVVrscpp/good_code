package java.section12;

public class CommandQuery {

	private int point;

	/**
	 * this method is modifire
	 * 
	 * @return point
	 */
	public int gainAndGetPoint() {
		this.point += 10;
		return this.point;
	}

	/**
	 * this method is command
	 */
	public void gainPoint() {
		this.point += 10;
	}

	/**
	 * this method is query
	 * 
	 * @return point
	 */
	public int getPoint() {
		return this.point;
	}
}
