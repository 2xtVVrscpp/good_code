package section6_part1.sample2_switch;

import section6_part1.MagicType;
import section6_part1.Member;

/** switch文の重複解消例 */
class Magic {
    final String _name;
    final int _costMagicPoint;
    final int _attackPower;
    final int _costTechnicalPoint;

    Magic(final MagicType magicType, final Member member) {
        switch (magicType) {
            case fire:
                _name = "ファイア";
                _costMagicPoint = 2;
                _attackPower = 20 + (int)(member._level * 0.5);
                _costTechnicalPoint = 0;
                break;
            case shiden:
                _name = "紫電";
                _costMagicPoint = 5 + (int)(member._level * 0.2);
                _attackPower = 50 + (int)(member._agility * 1.5);
                _costTechnicalPoint = 5;
                break;
            case hellFire:
                _name = "地獄の業火";
                _costMagicPoint = 16;
                _attackPower = 200 + (int)(member._magicAttack * 0.5 + member._vitality * 2);
                _costTechnicalPoint = 20 + (int)(member._level * 0.4);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}