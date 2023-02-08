package section6_part1.sample2_switch;

import section6_part1.MagicType;
import section6_part1.Member;

/** switch文の重複例 */
class MagicManager {
    String getName(MagicType magicType) {
        String name = "";
        switch (magicType) {
            case fire:
                name = "ファイア";
                break;
            case shiden:
                name = "紫電";
                break;
        }
        return name;
    }

    int costMagicPoint(MagicType magicType, Member member) {
        int magicPoint = 0;
        switch (magicType) {
            case fire:
                magicPoint = 2;
                break;
            case shiden:
                magicPoint = 5 + (int)(member._level * 0.2);
                break;
        }
        return magicPoint;
    }

    int attackPower(MagicType magicType, Member member) {
        int attackPower = 0;
        switch (magicType) {
            case fire:
                attackPower = 20 + (int)(member._level * 0.5);
                break;
            case shiden:
                attackPower = 50 + (int)(member._agility * 1.5);
                break;
        }
        return attackPower;
    }
}