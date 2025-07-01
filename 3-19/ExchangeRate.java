public class ExchangeRate {
    static double usdRate = 145.0;
    static double eurRate = 160.0;
    
    static void updateRates(double newUsdRate, double newEurRate){
        usdRate = newUsdRate;
        eurRate = newEurRate;
        System.out.println("レート更新");
    }
    public static int toJPY(String currency, double amount){
        if(currency.equals("USD")){
            return (int)(amount * usdRate); // ドルから日本円に換算
        }else if(currency.equals("EUR")){
            return (int)(amount * eurRate); // ユーロから日本円に換算
        } else{
            return -1; // その他の通貨の場合
        }

        }
    }

