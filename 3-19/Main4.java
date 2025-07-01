public class Main4 {
    public static void main(String[] args) {
        int jpy1 = ExchangeRate.toJPY("USD", 100.0);
        System.out.println("100ドル = " + jpy1 + "円");

        ExchangeRate.updateRates(145.0, 160.0);

        int jpy2 = ExchangeRate.toJPY("USD", 100.0);
        System.out.println("100ドル = " + jpy2 + "円");
        int jpy3 = ExchangeRate.toJPY("EUR", 80.0);
        System.out.println("80ユーロ = " + jpy3 + "円");
    }
}
