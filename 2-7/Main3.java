public class Main3 {
    public static void main(String[] args) {
        int attack = 15;
        int defense = 5;
        int damage = (attack * 2) - defense / 3;//小数点以下は切り捨て
        
        System.out.println("与えるダメージ：" + damage);
    }
}
