package section7.sample1_prisonkey;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        final ArrayList<Item> items = new ArrayList<>();
        final Item copperSword = new Item("銅のつるぎ");
        final Item prisonKey = new Item("牢屋の鍵");
        final Item apple = new Item("りんご");
        items.add(copperSword);
        items.add(prisonKey);
        items.add(apple);

        boolean hasPrisonKey = false;
        for (Item each : items){
            if(each._name.equals("牢屋の鍵")){
                hasPrisonKey = true;
                break;
            }
        }

        boolean hasPrisonKey = items.stream().anyMatch(item -> item._name.equals("牢屋の鍵"));

        System.out.println(hasPrisonKey);
    }
}
//コンパイル時はsection7より上のディレクトリからコンパイルする
//入力は"javac section7/sample1_prisonkey/プログラム名.java"