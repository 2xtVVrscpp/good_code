package section6_part1.sample3_interface.shape;

public class Main {
    public static void main(String[] args) {
        // 丸
        Circle circle = new Circle(10);
        System.out.println(circle.area());

        // 四角形
        Rectangle rectangle = new Rectangle(20, 25);
        System.out.println(rectangle.area());

        showArea(circle);
        showArea(rectangle);

        // showArea()の引数がアップキャストされても変数の型はそのまま
        System.out.println(circle.getClass());
        System.out.println(rectangle.getClass());
    }

    /**
     * 図形の面積を計算
     * @param shape CircleやRectangleはShapeにアップキャストされる
     */
	// ↓2023-01-25勉強会で議論した内容↓
	// showAreaを使用する場所が1箇所ならばこの実装で問題ない
	// 複数箇所ある場合は別途利用するためのクラスを実装する必要あり
    static void showArea(Shape shape) {
        System.out.println(shape.area());
    }
}
