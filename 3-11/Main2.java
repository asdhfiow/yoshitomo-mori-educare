public class Main2{
    public static void main(String[] args) {
        Book book = new Book("java入門", "山田太郎",2500, 5);
        
        book.displayInfo();
        book.checkStock();

    }
}
