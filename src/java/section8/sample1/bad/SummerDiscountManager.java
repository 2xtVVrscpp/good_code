package section8.sample1.bad;

public class SummerDiscountManager {
    DiscountManager discountManager = new DiscountManager();
    /**
     * 商品を追加する
     *
     * @parm product　商品
     * @return 追加成功時ture
     */
    public boolean add(Product product) {

        // 不正処理
        if (product.id < 0) {
            throw new IllegalArgumentException();
        }
        if (product.name.isEmpty()) {
            throw new IllegalArgumentException();
        }

        // 割引可能判定と加算
        // 割引価格の計算
        int tmp;
        if (product.canDiscount) {
            tmp = discountManager.totalPrice + discountManager.getDiscountPrice(product.price);
        } else {
            tmp = discountManager.totalPrice + product.price;
        }

        if (tmp <= 30000) {
            discountManager.totalPrice = tmp;

            discountManager.discountProducts.add(product);

            return true;
        } else {
            return false;
        }
    }
}
