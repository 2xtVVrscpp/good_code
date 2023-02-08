package section6_part1.sample3_interface.magic;

import section6_part1.Member;

class Fire implements Magic {
    private final Member _member;

    Fire(final Member member) {
        _member = member;
    }

    public String name() {
        return "ファイア";
    }

    public int costMagicPoint() {
        return 2;
    }

    public int attackPower() {
        return 20 + (int)(_member._level * 0.5);
    }
    
    public int costTechnicalPoint() {
        return 0;
    }
}
