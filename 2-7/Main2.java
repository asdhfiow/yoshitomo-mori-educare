public class Main2 {
    public static void main(String[] args) {
        int price = 2500;
        int discount = price * 1 / 5;  
        int salesPrice = price - discount;

        System.out.println("割引額：" + discount + "円");
        System.out.println("販売価格：" + salesPrice + "円");
    }
}
