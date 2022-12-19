package section5.sample5_5.badMagic;

import java.util.List;

// あまりこのコード理解できていない。。。
// 装備が、服と帽子と、盾とってあるから、リストで渡してる？？

/* 仕様
 * 　魔法を使うと魔法力は一定量減少する
 * 　回復アイテムなどにより、魔法力は一定量減少する
 * 　魔法力には最大値がある
 * 　魔法力は最大値まで回復可能
 * 　一部の装備品は、魔法力の最大値を増加させる効果がある
 */
class RecoverMagicPointMethod {
  /**
   * 魔法力を回復する
   * 
   * @param currentMagicPoint       現在の魔法力残量
   * @param originalMaxMagicPoint   オリジナルの魔法力最大値
   * @param maxMagicPointIncrements 魔法力最大値の増分
   * @param recoveryAmount          回復量
   * @return 回復後の魔法力残量
   */
  int recoverMagicPoint(
      int currentMagicPoint,
      int originalMaxMagicPoint,
      List<Integer> maxMagicPointIncrements,
      int recoveryAmount) {
    int currentMaxMagicPoint = originalMaxMagicPoint;
    for (int each : maxMagicPointIncrements) {
      currentMaxMagicPoint += each;
    }

    return Math.min(currentMagicPoint + recoveryAmount, currentMaxMagicPoint);
  }
}
