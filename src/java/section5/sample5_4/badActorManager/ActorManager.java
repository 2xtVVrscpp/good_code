package section5.sample5_4.badActorManager;

class ActorManager {
  // ゲームキャラの位置を移動する。
  void shift(Location location, int shiftX, int shiftY) {
    location.x += shiftX;
    location.y += shiftY;
  }
}
