public class Main2 {
    public static void main(String[] args) {

        Player player = new Player();
        player.name = "勇者";
        player.hp = 30;

        player.displayInfo();

        HealingPotion potion = new HealingPotion();
        potion.heal(player);

        System.out.println("回復ポーションを使いました");
        player.displayInfo();



    }
}
