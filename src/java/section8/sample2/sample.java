package section8.sample2;

public class sample {
  public static void main(String[] args){
    PhisicalAttack attack = new PhisicalAttack();
    FighterPhisicalAttack attack_fighter = new FighterPhisicalAttack();

    System.out.println("single: " + attack.singleAttack() + ", double: " + attack.doubleAttack());
    System.out.println("single: " + attack_fighter.singleAttack() + ", double: " + attack_fighter.doubleAttack());
  }
}
