package section9;


/* --------------------------------------------------------
 * name : Weapon
 * role : this class has weapon info
 * weapon info :
 *    _attack : attack point
 *    _defence : defence point
 * 
 * how to call
 *    Weapon weapon = new Weapon(int attack, int defence)
 * --------------------------------------------------------
 */
public class Weapon {
  /* --- attribute --- */
  private int _attack;
  private int _defence;

  /* --- constructor --- */
  public Weapon(int attack, int defence){
    this._attack = attack;
    this._defence = defence;
  }

  /* return code */
  static enum RETCODE{
    OK,           /* the function work correctly */
    LEVEL_FULL,   /* LEVEL is up to */
    NG            /* the function doesn't work correctly */
  }

  /* function */
  public int attackPower(){
    return this._attack;
  }
  public int defencePower(){
    return this._defence;
  }


  /* for debug */
  static enum RETCODE_D{
    OK,     /* OK */
    ERROR   /* some error */
  }

  public RETCODE_D weaponInfo(){
    System.out.println("[Weapon] Attack: " + this._attack);
    System.out.println("[Weapon] Defence: " + this._defence);
    return RETCODE_D.OK;
  }
}
