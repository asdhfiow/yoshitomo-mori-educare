public class Main2 {
    public static void main(String[] args){

        Book book = new Book(); //インスタンスの生成
        
        //java入門を登録しました　と出力
        book.setTitle(); //タイトルの設定
        book.getTitle(); //タイトルの取得


        //2回貸し出そうとする処理
        book.lend();
        book.lend();

        //本を返却する処理
        book.returnBook();

        //再度貸し出す処理
        book.lend();
    }
}
