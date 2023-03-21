package section9;

public class sample1 {
  public static void main(String args[]){
    Player player = new Player("aaa");
    Player player2 = new Player("bbb");
    byte level = 99;
    int test_type = 0;

    if(args.length != 0){
      test_type = Integer.parseInt(args[0]);
    }

    switch(test_type){
      case 1:
        /* test case1: level up */
        System.out.println("test case1: level up.");
        player.printPlayerInfo();
        player.level_up();
        player.printPlayerInfo();
        break;

      case 2:
        /* test case2: global variable */
        System.out.println("test case2: global variable.");
        Player.globalVal = 0;
        player.printPlayerInfo();
        player2.printPlayerInfo();
        break;

      case 3:
        /* test case3: level up when the level of player is more than 99 which is limit */
        System.out.println("test case3: level up when the level of player is limit.");
        player.levelBoost(level);
        player.level_up();
        player.printPlayerInfo();
        break;

      case 4:
        /* test case4: equip some item */
        System.out.println("test case4: equip some item.");
        player.equipment(new Weapon(100, 80));
        player.printPlayerInfo();
        break;

      default:
        System.out.println("-------------------------------------------------------");
        System.out.println("test pattern is below.");
        System.out.println("test case1: level up.");
        System.out.println("test case2: global variable.");
        System.out.println("test case3: level up when the level of player is limit.");
        System.out.println("test case4: equip some item.");
        System.out.println("-------------------------------------------------------");
    }
  }
}