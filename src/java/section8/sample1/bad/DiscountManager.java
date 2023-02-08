package section8.sample1.bad;

import java.util.List;
import java.util.ArrayList;


public class DiscountManager {
    List<Product> discountProducts = new ArrayList<>();;
    int totalPrice = 0;
    final int DISCOUNT_PRICE = 200;
    /**
     * 商品を追加する
     *
     * @parm product　商品
     * @parm productDiscount　商品割引情報
     * @return 追加成功時ture
     */
    boolean add(Product product, ProductDiscount productDiscount) {

        // 不正処理
        if (product.id < 0) {
            throw new IllegalArgumentException();
        }
        if (product.name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (product.id != productDiscount.id) {
            throw new IllegalArgumentException();
        }

        // 割引価格の計算
        int discountPrice = getDiscountPrice(product.price);

        // 割引可能判定と加算
        int tmp;
        if (productDiscount.canDiscount) {
            tmp = totalPrice + discountPrice;
        } else {
            tmp = totalPrice + product.price;
        }

        if (tmp <= 20000) {
            totalPrice = tmp;
            discountProducts.add(product);
            return true;
        } else {
            return false;
        }
    }

    /**
     * 割引価格を取得する
     *
     * @parm product　商品
     * @parm productDiscount　商品割引情報
     * @return 追加成功時ture
     */
    // static int getDiscountPrice(int price) {
    int getDiscountPrice(int price) {
        int discountPrice = price - DISCOUNT_PRICE;
        if (discountPrice < 0 ) {
            discountPrice = 0;
        }
        return discountPrice;
    }
}
