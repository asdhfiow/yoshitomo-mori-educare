public class Product {
    private String name;
    private int stock;

    public Product(String name ,int stock){
        this.name = name;
        this.stock = stock;
    }

    // 商品名を返す getter
    public String getName(){
        return name;
    }

    // 在庫数を返す getter
    public int getStock(){
        return stock;
    }

    // 在庫を追加
    public void addStock(int amount){
        if (amount <= 0) {
            System.out.println("エラー：追加する個数は正の整数である必要があります");
            return;
        }
        stock += amount;
        System.out.println(amount + "個追加しました");
    }

    // 在庫を減らす
    public void removeStock(int amount){
        if (amount <= 0) {
            System.out.println("エラー：減らす個数は正の整数である必要があります");
        } else if (stock < amount) {
            System.out.println("エラー: 在庫が不足しています");
        } else {
            stock -= amount;
            System.out.println(amount + "個販売しました");
        }
    }
}
