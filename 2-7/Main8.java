public class Main8 {
    public static void main(String[] args) {
        int attack = 50;
        int defense = 20;
        int damage = attack - defense;
        double critical = damage * 1.5;
        int criticalDamage = (int) critical;
        
        System.out.println("攻撃力を入力してください：" + attack);
        System.out.println("防御力を入力してください：" + defense);
        System.out.println("通常ダメージ：" + damage);
        System.out.println("クリティカルダメージ：" + criticalDamage);

    }
}
