package section8.sample2;

public class FighterPhisicalAttack extends PhisicalAttack {
  @Override
  int singleAttack(){
    return super.singleAttack() + 20;
  }

  @Override
  int doubleAttack(){
    return super.doubleAttack() + 10;
  } 
}
