public class Main5 {
    public static void main(String[] args) {
        Book book1 = new Book("java入門","山田太郎");
        System.out.println("本１：" + book1.title + "-" + book1.author + "(" + book1.page + ")");
        Book book2 = new Book("Python実践" , "鈴木次郎" ,300);
        System.out.println("本２：" + book2.title + "-" + book2.author + "(" + book2.page + ")");
    }
}