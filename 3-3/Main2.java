public class Main2 {
    public static void main(String[] args){

        Book book = new Book(); // インスタンスの生成
        
        // タイトルを設定して出力
        book.setTitle("Java入門");
        System.out.println(book.getTitle() + "を登録しました");

        // 2回貸し出そうとする処理
        book.lend();
        book.lend();

        // 本を返却する処理
        book.returnBook();

        // 再度貸し出す処理
        book.lend();
    }
}
