package section5.sample5_4.goodActorManager;

class Location {
  final int x;
  final int y;

  Location(final int x, final int y) {
    this.x = x;
    this.y = y;
  }

  Location shift(final int shiftX, final int shiftY) {
    final int nextX = x + shiftX;
    final int nextY = y + shiftY;
    return new Location(nextX, nextY);
  }
}
