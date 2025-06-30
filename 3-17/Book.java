public class Book {
    private String title;
    private boolean isLent;

    public Book(String title) {
        this.title = title;
        this.isLent = false; // 初期状態は未貸出
    }

    public String getTitle() {
        return title;
    }

    public boolean isLent() {
        return isLent;
    }

    protected void setLent(boolean isLent) {
        this.isLent = isLent;
    }
}
