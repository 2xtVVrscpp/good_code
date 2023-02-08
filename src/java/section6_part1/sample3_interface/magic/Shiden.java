package section6_part1.sample3_interface.magic;

import section6_part1.Member;

class Shiden implements Magic {
    private final Member _member;

    Shiden(final Member member) {
        _member = member;
    }

    public String name() {
        return "紫電";
    }

    public int costMagicPoint() {
        return 5 + (int)(_member._level * 0.2);
    }
    
    public int attackPower() {
        return 50 + (int)(_member._agility * 1.5);
    }
    
    public int costTechnicalPoint() {
        return 5;
    }
}
