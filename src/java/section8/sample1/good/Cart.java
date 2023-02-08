package section8.sample1.good;

import section8.sample1.bad.Product;

import java.util.List;
import java.util.ArrayList;

public class Cart {
    List<Product> products = new ArrayList<>();;
    int totalPrice = 0;

    /**
     * 商品を追加する
     *
     * @parm product　商品
     * @parm productDiscount　商品割引情報
     * @return 追加成功時ture
     */
    boolean add(Product product) {

        // 不正処理
        if (product.id < 0) {
            throw new IllegalArgumentException();
        }
        if (product.name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.products.add(product);
        return true;
    }
}
