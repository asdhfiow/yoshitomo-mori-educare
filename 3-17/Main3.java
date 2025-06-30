public class Main3 {
    public static void main(String[] args) {
        Product pr = new Product("りんご", 100);

        System.out.println("商品名: " + pr.getName());
        System.out.println("在庫数: " + pr.getStock() + "個");
        pr.removeStock(50);

        System.out.println("商品名: " + pr.getName());
        System.out.println("在庫数: " + pr.getStock() + "個");
        pr.addStock(10);

        System.out.println("商品名: " + pr.getName());
        System.out.println("在庫数: " + pr.getStock() + "個");
        pr.removeStock(44444444); // 在庫不足エラー出るはず
    }
}
