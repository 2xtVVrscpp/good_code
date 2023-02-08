package section8.sample1.bad;

public class Main {
    public static void main(String[] args) {

        // 100円の大根
        Product product = new Product(1, "高級大根", 1000);

        ProductDiscount productDiscount = new ProductDiscount(product.id, true);
        DiscountManager discountManager = new DiscountManager();
        System.out.println(discountManager.add(product, productDiscount));
        System.out.println("Didscount price : " + discountManager.totalPrice);

        product.canDiscount = true;
        SummerDiscountManager summerDiscountManager = new SummerDiscountManager();
        System.out.println(summerDiscountManager.add(product));
        System.out.println("SummerDidscount price : " + summerDiscountManager.discountManager.totalPrice);

    }
}