public class Main2 {
    public static void main(String[] args) {
        // 果物倉庫のテスト
        System.out.println("果物倉庫：");
        Warehouse<String> fruitWarehouse = new Warehouse<>();
        fruitWarehouse.store("バナナ");
        fruitWarehouse.retrieve();
        System.out.println("空チェック: " + fruitWarehouse.isEmpty());

        // 日用品倉庫のテスト
        System.out.println("\n日用品倉庫：");
        Warehouse<String> dailyGoodsWarehouse = new Warehouse<>();
        dailyGoodsWarehouse.store("ティッシュ");
        dailyGoodsWarehouse.retrieve();
        System.out.println("空チェック: " + dailyGoodsWarehouse.isEmpty());
    }
}
