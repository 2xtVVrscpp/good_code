package section6_part1.sample3_interface.shape;

public class Main {
    public static void main(String[] args) {
        // 円
        Shape shape = new Circle(10);
        System.out.println(shape.area());

        // 四角形
        shape = new Rectangle(20, 25);
        System.out.println(shape.area());

        showArea(shape);
    }

    // 図形の面積を計算
    static void showArea(Shape shape) {
        System.out.println(shape.area());
    }
}