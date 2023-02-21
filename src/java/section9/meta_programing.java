package section9;

import java.lang.reflect.Field;

public class meta_programing {
  public static void main(String args[]){
    Player player = new Player("aaa");
    player.printPlayerInfo();

    try{
      System.out.println("--- meta programing ---");
      Field field = Player.class.getDeclaredField("UP_STATUS");
      field.setAccessible(true);
      int get_val = (int)field.getInt(player);
      System.out.println("[UP_STATUS] get value: " + get_val);
      field.setInt(player, 10);
      get_val = (int)field.getInt(player);
      System.out.println("[UP_STATUS] set value: " + get_val);

      Field fieldAttack = Player.class.getDeclaredField("_attack");
      fieldAttack.setAccessible(true);
      get_val = (int)fieldAttack.getInt(player);
      System.out.println("[_attack] get value: " + get_val);
      fieldAttack.setInt(player, 1000);
      get_val = (int)fieldAttack.getInt(player);
      System.out.println("[_attack] set value: " + get_val);

      System.out.println("-----------------------");

    }catch(NoSuchFieldException e){
      System.out.println("meta programing: No such variable.");
    }catch(IllegalAccessException e){
      System.out.println("meta programing: cannot access variable.");
    }

    player.printPlayerInfo();

    Player player2 = new Player("bbb");
    player2.printPlayerInfo();
  }
}
