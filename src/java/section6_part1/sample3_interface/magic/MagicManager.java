package section6_part1.sample3_interface.magic;

import java.util.HashMap;
import java.util.Map;

import section6_part1.MagicType;
import section6_part1.Member;

class MagicManager {
    final Map<MagicType, Magic> magics = new HashMap<>();

    MagicManager(final Member member) {
        Magic fire = new Fire(member);
        Magic shiden = new Shiden(member);
        Magic hellFire = new HellFire(member);

        magics.put(MagicType.fire, fire);
        magics.put(MagicType.shiden, shiden);
        magics.put(MagicType.hellFire, hellFire);
    }

    void magicAttack(final MagicType magicType) {
        final Magic usingMagic = magics.get(magicType);

        showMagicName(usingMagic);
        consumeMagicPoint(usingMagic);
        consumeTechnicalPoint(usingMagic);
        magicDamage(usingMagic);
    }
    
    // 魔法の名前を画面表示する 
    void showMagicName(final Magic magic) {
        final String name = magic.name();
        // nameを使った表示処理
        System.out.println("-" + name + "-");
    }
    
    // 魔法力を消費する
    void consumeMagicPoint(final Magic magic) {
        final int costMagicPoint = magic.costMagicPoint();
        // costMagicPointを使った魔法力消費処理
        System.out.println("魔法力: " + costMagicPoint);
    }
    
    // テクニカルポイントを消費する
    void consumeTechnicalPoint(final Magic magic) {
        final int costTechnicalPoint = magic.costTechnicalPoint();
        // costTechnicalPointを使ったテクニカルポイント消費処理
        System.out.println("テクニカルポイント: " + costTechnicalPoint);
    }
    
    // ダメージ計算する
    void magicDamage(final Magic magic) {
        final int attackPower = magic.attackPower();
        // attackPowerを使ったダメージ計算
        System.out.println("ダメージ: " + attackPower);
    }
}