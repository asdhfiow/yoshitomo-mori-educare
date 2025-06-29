public class Library {

    // 本を貸し出す
    public void lendBook(Book book) {
        if (!book.isLent()) {
            book.setLent();
            System.out.println("「" + book.getTitle() + "」を貸し出しました");
        } else {
            System.out.println("エラー：この本は既に貸し出し中です");
        }
    }

    // 本を返却する
    public void returnBook(Book book) {
        if (book.isLent()) {
            book.setReturned();
            System.out.println("「" + book.getTitle() + "」が返却されました");
        } else {
            System.out.println("エラー：この本は貸し出されていません");
        }
    }
}
