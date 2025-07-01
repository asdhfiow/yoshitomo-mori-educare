public class Library {
    static int availableBooks = 100; // 貸し出し可能な本の総数

    static void display(){
        System.out.println("貸出可能な本：" + availableBooks);
    }
    static void borrowBooks(){
    if(availableBooks > 0){
        System.out.println("１冊本を貸りました");
        availableBooks --;
    }else{
        System.out.println("貸出可能な本はありません");
    }
}
    // 本を返却
    static void returnBooks(){
        availableBooks ++;
        System.out.println("本を返却しました");
    }
    static int getAvailableBooks(){
        return availableBooks;
    }
}
