package section6_part1.sample1_nest;

public class Main {
    public static void main(String[] args) {
        Member member = new Member();
        Magic magic = new Magic("fire", 30);

        /** リスト6.1 */
        // 生存しているか判定
        if (0 < member._hitPoint) {
            // 行動可能かを判定
            if (member.canAct()) {
                // 魔法力が残存しているかを判定
                if (magic._costMagicPoint <= member._magicPoint) {
                    member.consumeMagicPoint(magic._costMagicPoint);
                    member.chant(magic);
                }
            }
        }

        /** リスト6.4 */
        if (member._hitPoint <= 0) return;
        if (!member.canAct()) return;
        if (member._magicPoint < magic._costMagicPoint) return;

        member.consumeMagicPoint(magic._costMagicPoint);
        member.chant(magic);
    }
}