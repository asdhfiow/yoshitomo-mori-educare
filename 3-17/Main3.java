public class Main3 {
    public static void main(String[] args) {
        Product pr = new Product("りんご", 100);
        pr.getProduct();
        pr.getQuantities();
        pr.removeStock(50);

        pr.getProduct();
        pr.getQuantities();
        pr.addStock(10);

        pr.getProduct();
        pr.getQuantities();
        pr.removeStock(999999);

        
    }
}
