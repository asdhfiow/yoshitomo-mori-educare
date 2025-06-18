public class Book {
    //フィールド
    String title;
    boolean isLent = false;//最初は貸出中ではない

void setTitle(){
    this.title = "「Java入門」";
}
void getTitle(){
    System.out.println(this.title + "を登録しました");
}

void lend(){
    if (isLent == false){
        isLent = true;
        System.out.println("本を貸し出しました");
        } else {
            System.out.println("申し訳ありません。この本は貸し出中です");
        }
}
void returnBook(){
    if(isLent != false){
        isLent = false;
        System.out.println("本が返却されました");
    }
}
}