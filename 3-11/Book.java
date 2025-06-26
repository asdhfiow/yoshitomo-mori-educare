public class Book extends Product{
    String author;
    int stockQuantity;

    Book(String name, String author, int price, int stockQuantity){
        this.name = name;
        this.author = author;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    @Override
    public void displayInfo(){
        System.out.println("書籍名：" + name);
        System.out.println("著者：" + author);
        System.out.println("価格：" + price + "円");
    }

    @Override
    public void checkStock(){
        if(stockQuantity > 0){
            System.out.println("在庫あり");
        }else {
            System.out.println("在庫なし");
        }
    }
}