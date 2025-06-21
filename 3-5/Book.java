public class Book {
    String title;
    String author;
    int page;

    public Book(String title, String author){
        this.title = "java入門";
        this.author = "山田太郎";
        this.page = 0;
    }
    public Book(String title, String author, int page){
        this.title = "Python実践";
        this.author = "鈴木次郎";
        this.page = page;
    }
}
