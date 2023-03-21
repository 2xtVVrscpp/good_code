package section9;
import java.util.Random;

/* ------------------------------------------
 * name : Player
 * role : this class has player info
 * player info :
 *    _name     : name
 *    _level    : level (1 <= level <= 99)
 *    _attack   : attack point
 *    _defence  : defence point
 *    _individualAttack  : the individual value about attack
 *    _individualDefence : the individual value about defence
 *    _weapon   : weapon info
 * 
 * how to call
 *    Player player = new Player(String name)
 * ------------------------------------------
 */
public class Player {
  /* --- attribute --- */
  private String _name;
  private byte _level;
  private int _attack;
  private int _defence;
  private int _individualAttack;
  private int _individualDefence;
  private Weapon _weapon;

  /* the limit of status */
  private final int UP_STATUS = 255;

  /* global value */
  public static int globalVal = 100;

  /* for debug */
  private final boolean DEBUG = true;

  /* return code */
  static enum RETCODE{
    OK,           /* the function work correctly */
    LEVEL_FULL,   /* LEVEL is up to */
    NG            /* the function doesn't work correctly */
  }

  /* --- constractor ---
  * init some value
  * - name : defined by argument
  * - level : 1
  * - attack/defence power : random
  * - equipment : the weapon which attack/defence power are 0;
  *               if it is null, exception process is too hard.
  */

  public Player(String name){
    if((name == null) || name.equals("")){
      throw new IllegalArgumentException("input is wrong. please some charactor");
    }
    this._name = name;
    this._level = 1;
    initAttack();
    initDefence();
    addAttackPoint();
    addDefencePoint();
    //equipment(null);
    equipment(new Weapon(0, 0));
  }

  /* --- function --- */

  /* for level up */
  public RETCODE level_up(){
    if (this._level >= 99) {
      if(DEBUG){
        System.out.println("1 <= level <= 99, your input is " + this._level);
      }
      this._level = 99;
      return RETCODE.LEVEL_FULL;
    }
    
    addAttackPoint();
    addDefencePoint();
    this._level++;

    if (this._level == 100) {
      // レベル100のボーナスとして、
      // 固有の特別能力を付与する。
      addSpecialAbility();
    }
    return RETCODE.OK;
  }

  private RETCODE initAttack(){
    Random rand = new Random();
    this._individualAttack =  rand.nextInt(10)+1;
    return RETCODE.OK;
  }

  private RETCODE initDefence(){
    Random rand = new Random();
    this._individualDefence = rand.nextInt(10)+1;
    return RETCODE.OK;
  }

  /* include attack point when level up */
  public RETCODE addAttackPoint(){
    Random rand = new Random();
    int increaseAttack = rand.nextInt(4)+this._individualAttack;
    if(this._attack + increaseAttack > UP_STATUS){
      this._attack = UP_STATUS;
    }else{
      this._attack += increaseAttack;
    }
    return RETCODE.OK;
  }

  /* include defence point when level up */
  public RETCODE addDefencePoint(){
    Random rand = new Random();
    int increaseDefence = rand.nextInt(4)+this._individualDefence;
    if(this._defence + increaseDefence > UP_STATUS){
      this._defence = UP_STATUS;
    }else{
      this._defence += increaseDefence;
    }
    return RETCODE.OK;
  }

  /* special function when level is 100 */
  public RETCODE addSpecialAbility(){
    return RETCODE.OK;
  }

  /* equip some weapon to player */
  public RETCODE equipment(Weapon weapon){
    this._weapon = weapon;
    return RETCODE.OK;
  }

  // --- for debug ---
  static enum RETCODE_D{
    OK,     /* OK */
    ERROR   /* some error */
  }

  /* -------------------------------------
   *
   * this function is for level up boost
   * you can level up to argument value
   * ※ the argument is byte type
   * 
   * -------------------------------------
  */
  public RETCODE_D levelBoost(byte boost){
    if(boost > 99 || boost <= 0){
      System.out.println("1 <= level <= 99");
      return RETCODE_D.ERROR;
    }

    Random rand = new Random();
    /* increase attack point */
    /* this flow is same as addAttackPoint */
    int increaseAttack = (rand.nextInt(4)+this._individualAttack) * (boost-this._level);
    if(this._attack + increaseAttack > UP_STATUS){
      System.out.println("up to");
      this._attack = UP_STATUS;
    }else{
      this._attack += increaseAttack;
    }

    /* increase defence point */
    /* this flow is same as addDefencePoint */
    int increaseDefence = (rand.nextInt(4)+this._individualDefence) * (boost-this._level);
    if(this._defence + increaseDefence > UP_STATUS){
      System.out.println("up to");
      this._defence = UP_STATUS;
    }else{
      this._defence += increaseDefence;
    }
    this._level = boost;

    return RETCODE_D.OK;
  }

  /* this output function is for debug */
  public RETCODE_D printPlayerInfo(){
    System.out.println("--- player info ---");
    System.out.println("[Player] name: " + this._name);
    System.out.println("[Player] level: " + this._level);
    System.out.println("[Player] indivite attack: " + this._individualAttack);
    System.out.println("[Player] attack: " + this._attack);
    System.out.println("[Player] indivite defence: " + this._individualDefence);
    System.out.println("[Player] defence: " + this._defence);
    this._weapon.weaponInfo();
    System.out.println("[Player] UP_STATUS: " + this.UP_STATUS);
    System.out.println("[Player] global val: " + Player.globalVal);
    System.out.println("-------------------");

    return RETCODE_D.OK;
  }
}
