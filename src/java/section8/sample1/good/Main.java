package section8.sample1.good;

import section8.sample1.bad.Product;

public class Main {
    public static void main(String[] args) {

        // 100円の大根
        Product product = new Product(1, "高級大根", 2000);

        RegularPrice regularPrice = new RegularPrice(product.price);

        RegularDiscountedPrice regularDiscountedPrice = new RegularDiscountedPrice(regularPrice);
        SummerDiscountedPrice summerDiscountedPrice = new SummerDiscountedPrice(regularPrice);
        System.out.println("RegularDidscount price : " + regularDiscountedPrice.amount);
        System.out.println("SummerDidscount price : " + summerDiscountedPrice.amount);


        // カート処理
        Cart cart = new Cart();
        boolean is_summer = true;

        for(int i=0; i<30; i++) {
            Product __product = new Product(i+1, "高級大根", 2000);
            // 割引可能判定と加算
            // 割引価格の計算
            int tmp;
            if (__product.canDiscount) {
                tmp = cart.totalPrice + summerDiscountedPrice.amount;
            } else {
                tmp = cart.totalPrice + __product.price;
            }

            if (is_summer && tmp <= 30000) {
                __product.price = summerDiscountedPrice.amount;
            } else if (!is_summer && tmp <= 2000){
                __product.price = regularDiscountedPrice.amount;
            }
            cart.totalPrice = cart.totalPrice + __product.price;
            cart.add(__product);

        }
        System.out.print(cart.totalPrice);

        for(int i=0; i<30; i++) {
            System.out.print(cart.products.get(i).name);
            System.out.println(cart.products.get(i).price);
        }
    }
}
