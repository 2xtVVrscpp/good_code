package section7.sample2_earlycontinue;

import section7.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Party  _party = new Party();
        Member _member1 = new Member(1);
        Member _member2 = new Member(2);
        Member _member3 = new Member(3);
        Member _member4 = new Member(4);
        Member _member5 = new Member(5);

        final Party _party1 = _party.add(_member1);
        final Party _party2 = _party1.add(_member2);
        final Party _party3 = _party2.add(_member3);
        final Party _party4 = _party3.add(_member4);
        _party4.showList();

        _party = _party4.add(_member5);
    // _party = _party4.add(_member4);
        
    }
}
