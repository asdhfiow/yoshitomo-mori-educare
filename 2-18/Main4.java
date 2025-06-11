public class Main4 {
    public static void main(String[] args) {
        int[] prices = {100, 200, 300};
        int[] quantities = {1, 2, 3};

        // 商品価格と数量を表示
        System.out.print("商品価格: [");
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i]);
            if (i != prices.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("], 数量: [");
        for (int i = 0; i < quantities.length; i++) {
            System.out.print(quantities[i]);
            if (i != quantities.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // 合計金額（税込）を表示
        System.out.print("合計金額: [");
        for (int i = 0; i < prices.length; i++) {
            int subtotal = (int)(prices[i] * quantities[i] * 1.08);
            System.out.print(subtotal);
            if (i != prices.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
