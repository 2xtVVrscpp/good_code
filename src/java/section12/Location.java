package section12;

public class Location {
	public int x;
	public int y;
	private static final int MIN_VALUE = 0;

	/**
	 * @param x
	 * @param y
	 */
	public Location(final int x, final int y) {

		// if you want to run badShift, you comment out below `if`.
		if (!this.valid(x, y)) {
			throw new IllegalArgumentException("不正な位置です");
		}
		this.x = x;
		this.y = y;
	}

	/**
	 * @param x
	 * @param y
	 * @return
	 */
	private boolean valid(final int x, final int y) {
		if (x < MIN_VALUE) {
			return false;
		}
		if (y < MIN_VALUE) {
			return false;
		}
		return true;
	}

	public Location shift(final int shiftX, final int shiftY) {
		int nextX = this.x + shiftX;
		int nextY = this.y + shiftY;

		return new Location(nextX, nextY);
	}

	// public Location badShift(final int shiftX, final int shiftY) {
	// int nextX = this.x + shiftX;
	// int nextY = this.y + shiftY;

	// if (this.valid(nextX, nextY)) {
	// return new Location(nextX, nextY);
	// }
	// return new Location(-1, -1);
	// }

}
