public class Main4 {
    public static void main(String[] args) {
        ExchangeRate er = new ExchangeRate();

        double yen1 = er.toJPY("USD", 100.0);
        System.out.println("100ドル = " + (int)yen1 + "円");        

        er.updateRate(150.0, 160.0);

        double yen2 = er.toJPY("USD", 100.0);
        System.out.println("100ドル = " + (int)yen2 + "円");

        double yen3 = er.toJPY("EUR", 80.0);
        System.out.println("80ユーロ = " + (int)yen3 + "円");
    }
}
