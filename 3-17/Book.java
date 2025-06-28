public class Book {
    private String title;
    private boolean isLent;

    public Book(String title, boolean isLent){
        this.title = title;
        this.isLent = isLent;
    }

    // タイトル取得用getterメソッド
    public String getTitle(){
        return title;
    }

    // 貸出状態確認用メソッド
    public boolean isLent(){
        return isLent;
    }

    // 貸出状態変更用メソッド（貸出中にする）
    protected void setLent(){
        this.isLent = true;
    }

    // 返却処理（貸出状態を解除）
    protected void setReturned(){
        this.isLent = false;
    }
}
