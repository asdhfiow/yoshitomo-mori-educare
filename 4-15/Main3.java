// メインクラス
public class Main3 {
    public static void main(String[] args) {
        // 各カテゴリの在庫を作成

        // TODO: String型の在庫を3つ作成（果物、野菜、乳製品）
        Inventory<String> fruits = new Inventory<String>(ProductCategory.FRUITS);
        Inventory<String> vegetables = new Inventory<String>(ProductCategory.VEGETABLES);
        Inventory<String> dairy = new Inventory<String>(ProductCategory.DAIRY);

        // 商品を入荷
        // TODO: それぞれの在庫に商品を入荷
        fruits.stockIn("りんご");
        vegetables.stockIn("トマト");
        dairy.stockIn("牛乳");
        System.out.println();

        // TODO: りんごを出荷
        System.out.println(fruits.stockOut() + "を出荷しました");
        
        // 在庫状態を表示
        System.out.println("現在の在庫状態:");

        // TODO: 各カテゴリの在庫状態を表示
        // ヒント: getCurrentStock()がnullの場合は"なし"と表示
        System.out.println("果物: " + (fruits.getCurrentStock() != null ? 
            fruits.getCurrentStock() : "なし"));
        System.out.println("野菜: " + (vegetables.getCurrentStock() != null ?
            vegetables.getCurrentStock() : "なし"));
        System.out.println("乳製品: " + (dairy.getCurrentStock() != null ?
            dairy.getCurrentStock() : "なし"));
    }
}