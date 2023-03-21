package section12;

public class CommandQuery {

	private int point;
	private static final int GAIN_POINT = 10;

	public CommandQuery(int point) {
		this.point = point;
	}

	/**
	 * this method is modifire
	 * 
	 * @return point
	 */
	public int gainAndGetPoint() {
		this.point += GAIN_POINT;
		return this.point;
	}

	/**
	 * this method is command
	 */
	public void gainPoint() {
		this.point += GAIN_POINT;
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
