public class Main1{
    public static void main(String[] args){
        int price = 1000;
        int quantity = 3; 
        calculateTotal(price,quantity);
    }
    
    public static double calculateTotal(int price, int quantity){
        System.out.println("商品価格:" + price + "円," + "数量：" + quantity);
        double result = (price * quantity) * 1.08;

        System.out.println("合計金額（税込）：" + (int)result + "円");
        return result;
    }
}
