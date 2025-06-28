public class Main4 {
    public static void main(String[] args) {
        Library lib = new Library("Java入門", false);

        lib.lendBook();    
        lib.lendBook();    
        lib.returnBook();  
        lib.lendBook();    
    }
}
