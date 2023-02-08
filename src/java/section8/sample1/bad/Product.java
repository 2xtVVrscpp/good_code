package section8.sample1.bad;

public class Product {
    public final int id;
    public final String name;
    public int price;
    public boolean canDiscount = false;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
