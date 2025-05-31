public class Main5 {
    public static void main(String[] args) {
        int note = 280 * 3;
        int pencils = 120 * 5;
        int erasers = 100 * 2;
        int sum = note + pencils + erasers;
        int tax = (note + pencils + erasers) * 10 / 100;
        int change = 2000 - (sum + tax);
        
        System.out.println("小計：" + sum);
        System.out.println("消費税：" + tax);
        System.out.println("合計：" + (sum + tax));
        System.out.println("お釣り："+ change);
    }
}
