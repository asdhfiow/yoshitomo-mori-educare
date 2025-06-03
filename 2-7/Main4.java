public class Main4 {
    public static void main(String[] args) {
        double maxHP = 1000.0;
        double damaged = maxHP * 83.7 / 100; 
        int currentHP = (int)damaged;

        System.out.println("最大HP：" + currentHP);
    }

}
