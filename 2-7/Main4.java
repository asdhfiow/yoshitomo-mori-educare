public class Main4 {
    public static void main(String[] args) {
        double maxHp = 1000.0 * 83.7 / 100; //最大HP（小数点以下は切り捨て）
        int HP = (int)maxHp;//小数点以下切り捨て

        System.out.println("最大HP：" + HP );
    }

}
