import java.util.*;
// 在庫管理クラス
public class InventoryManager {
    // TODO: 商品を格納するMapを作成（キー：商品名、値：商品）
    private Map<String, Product> inventory = new HashMap<>();

    // TODO: 商品を追加するメソッド
    public void addProduct(String name, int stock) {
        // TODO:
        // 1. 新しい商品を作成
        Product product = new Product(name, stock);

        // 2. inventoryに追加
        inventory.put(name, product);

        // 3. "[商品名]を入荷しました" を表示
        System.out.println(name + "を入荷しました");
    }

    // TODO: 商品を検索するメソッド（Optional使用）
    private Optional<Product> findProduct(String name) {
        // TODO: 商品を検索してOptionalでラップして返す
        return Optional.ofNullable(inventory.get(name));
    }

    // TODO: 商品を販売するメソッド
    public void sellProduct(String name) {
        // TODO: findProductの結果を取得
        Optional<Product> product = findProduct(name);

        // TODO: productが存在する場合
        if (product.isPresent()) {
            // TODO:ここで在庫を1減らす
            product.get().decreaseStock();
            System.out.println(name + "の販売: 在庫から1個減少");
        } else {
            // 存在しない場合
            System.out.println("商品が見つかりません");
        }
    }
}