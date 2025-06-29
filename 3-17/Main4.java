public class Main4 {
    public static void main(String[] args) {
        Library lib = new Library();
        Book book = new Book("Java入門", false);

        lib.lendBook(book);    
        lib.lendBook(book);    
        lib.returnBook(book);  
        lib.lendBook(book);    
    }
}
