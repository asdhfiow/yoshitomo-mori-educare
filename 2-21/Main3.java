import java.util.Date;

public class Main3 {
    public static void main(String[] args){
        showCurrentTime();
}
    public static void showCurrentTime(){
        Date now = new Date();
        System.out.println("現在の日付：" + now);
    }
}
