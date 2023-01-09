package section6_part1.sample3_interface.magic;

import section6_part1.MagicType;
import section6_part1.Member;

public class Main {
    public static void main(String[] args) {
        Member member = new Member();
        MagicManager manager = new MagicManager(member);

        for (MagicType magicType : MagicType.values()) {
            manager.magicAttack(magicType);
        }
    }
}