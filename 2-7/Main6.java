public class Main6 {
    public static void main(String[] args) {
        String exPoint = "1000";
        int ExPoint = Integer.parseInt(exPoint); //小数点以下切り捨て
        int bonusPoint = ExPoint * 125 / 100;

        System.out.println("現在の経験値を入力してください：" + exPoint);
        System.out.println("ボーナス後の経験値：" + bonusPoint);
    }
}
