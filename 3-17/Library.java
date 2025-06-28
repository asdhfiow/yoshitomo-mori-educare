public class Library extends Book {

    public Library(String title, boolean isLent) {
        super(title, isLent);
    }

    // 本を貸し出す
    public void lendBook() {
        if (!isLent()) {
            setLent();
            System.out.println("「" + getTitle() + "」を貸し出しました");
        } else {
            System.out.println("エラー：この本は既に貸し出し中です");
        }
    }

    // 本を返却する
    public void returnBook() {
        if (isLent()) {
            setReturned();
            System.out.println("「" + getTitle() + "」が返却されました");
        } else {
            System.out.println("エラー：この本は貸し出されていません");
        }
    }
}
