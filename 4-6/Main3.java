// ここにコードを書いてください
// 必要なインポート文を記載
import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
        // 商品名と在庫数を管理するHashMapを作成
        Map<String, Integer> productStock = new HashMap<>();

        // 商品を入荷（在庫を追加）
        productStock.put("おにぎり",15);
        productStock.put("サンドイッチ", 8);
        productStock.put("お弁当" ,5);

        // 現在の在庫状況を表示
        System.out.println("在庫状況" + productStock);

        // おにぎりを1個販売
        int currentStock = productStock.get("おにぎり");
        System.out.println("おにぎりを1個販売しました");
        productStock.put("おにぎり" , currentStock - 1);


        // 更新後の在庫状況を表示
        System.out.println("在庫状況：" + productStock);
        
        // アイスクリームの在庫確認
        boolean hasIcecream = productStock.containsKey("アイスクリーム");
        System.out.println("アイスは在庫がありますか？" + hasIcecream);
    }
}
