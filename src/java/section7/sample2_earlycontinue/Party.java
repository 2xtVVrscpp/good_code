package section7.sample2_earlycontinue;

import section7.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Party {
    static final int MAX_MEMBER_COUNT = 4;
    private final List<Member> members;

    Party(){
        members = new ArrayList<Member>();
    }
    private Party(List<Member> members){
        this.members = members;
    }
    /*
     * メンバーを追加する
     * ＠param newMember 追加したいメンバー
     * ＠return メンバー追加後のパーティ
     */
    Party add(final Member newMember){
        if(exists(newMember)){
            throw new RuntimeException("既にパーティーに加わっています");
        }
        if(isFull()){
            throw new RuntimeException("これ以上メンバーを追加できません");
        }
        final List<Member> adding = new ArrayList<>(members);
        adding.add(newMember);
        return new Party(adding);
    }

    /*@return パーティのメンバーが一人でも生存している場合true */
    boolean isAlive(){
        return members.stream().anyMatch(each -> each.isAlive());
    }
    /*
    @param member パーティに所属しているかを調べたいメンバー
    @return 既にパーティに所属している場合true
    */
    boolean exists(final Member member){
        return members.stream().anyMatch(each -> each._id == member._id);
    }
    /*
     * @return パーティが満員の場合true
     */
    boolean isFull(){
        return members.size() == MAX_MEMBER_COUNT;
    }
    /*@return メンバーリスト。ただし要素の変更はできません */
    List<Member> members(){
        return Collections.unmodifiableList(members);
    }
    /*毒ダメージ */
    void poisonDamage(){
        
        for (Member member : members){
            if(member._hitPoint ==0 ) continue;
            if(!member.containsState(StateType.Poison)) continue;

            member._hitPoint -= 10;
            member._hitPoint = 0;
            //ステータスの追加とかはまだ作ってない...
            //member.addState(StateType.dead);
            //member.remobeState(StateType.poison);
        }
        
    }
    void conectAttack(){
        int  totalDamage = 0;
        for(Member member : members){
            if(!member.hasTeamAttackSocceeded()) break;
            int damage = (int)(member.attack()*1.1);
            if (damage < 30)break;
            totalDamage += damage;
        }
    }

    public void showList(){
        for(Member member : members){
            System.out.println(member._id);
        }
        /*
        for (int i=0; i<members.size(); ++i){
            System.out.println(members.get(i));
        } */

    }

}
