public class Main1 {
    public static void main(String[] args) {
        int price = 1000;
        int quantity = 3;

        int total = calculateTotal(price, quantity); 
        showInfo(price, quantity, total);
    }

    public static int calculateTotal(int price, int quantity) {
        double result = (price * quantity) * 1.08;
        return (int) result;  
    }

    public static void showInfo(int price, int quantity, int total) {
        System.out.println("商品価格：" + price + "円, 数量：" + quantity);
        System.out.println("合計金額（税込）：" + total + "円");
    }
}
