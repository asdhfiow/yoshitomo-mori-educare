public class Book {
    // フィールド
    private String title;
    private boolean isLent; // 初期値falseなので代入不要

    // タイトルを設定するメソッド
    public void setTitle(String title){
        this.title = title;
    }

    // タイトルを取得するメソッド
    public String getTitle(){
        return this.title;
    }

    // 本を貸し出す処理
    public void lend(){
        if (!isLent){
            isLent = true;
            System.out.println("本を貸し出しました");
        } else {
            System.out.println("申し訳ありません。この本は貸し出中です");
        }
    }

    // 本を返却する処理
    public void returnBook(){
        if (isLent){
            isLent = false;
            System.out.println("本が返却されました");
        }
    }
}
