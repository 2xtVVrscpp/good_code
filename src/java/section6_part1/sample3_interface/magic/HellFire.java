package section6_part1.sample3_interface.magic;

import section6_part1.Member;

class HellFire implements Magic {
    private final Member _member;

    HellFire(final Member member) {
        _member = member;
    }

    public String name() {
        return "地獄の業火";
    }

    public int costMagicPoint() {
        return 16;
    }
    
    public int attackPower() {
        return 200 + (int)(_member._magicAttack * 0.5 + _member._vitality * 2);
    }
    
    public int costTechnicalPoint() {
        return 20 + (int)(_member._level * 0.4);
    }
}
