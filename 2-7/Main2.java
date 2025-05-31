public class Main2 {
    public static void main(String[] args) {
        int x = 2500;
        int discount = x * 4 % 5;  //割引額（20%引き）
        int price = 2500 - discount;  //割引後の価格

        System.out.println("割引額：" + discount + "円");
        System.out.println("販売価格：" + price + "円");
    }
}
