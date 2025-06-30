public class Library {
    static int availableBooks = 100; // 貸し出し可能な本の総数

    public void display(){
        System.out.println("貸出可能な本：" + availableBooks);
    }
    public void borrowBooks(){
        if(availableBooks < 0){
            System.out.println("貸出できる本がありません");
        }else{
            System.out.println("一冊借りました");
            availableBooks --;
        }
    }
    // 本を返却
    public void returnBooks(){
        availableBooks ++;
        System.out.println("本を返却しました");
    }
    public static int getAvailableBooks(){
        return availableBooks;
    }
}
