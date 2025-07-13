// Main.java
public class Main5 {
    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter("勇者A");

        Equipment sword = new Equipment("伝説の剣", 100, 0);
        Equipment shield = new Equipment("光の盾", 0, 80);
        Equipment boots = new Equipment("魔法の靴", 10, 20);

        hero.addEquipment(sword);
        hero.addEquipment(shield);
        hero.addEquipment(boots);

        System.out.println("--- キャラクター装備情報 ---");
        hero.showEquipments();

        // 複製テスト
        Equipment swordCopy = sword.clone();
        boolean cloneTest = sword.equals(swordCopy);
        System.out.println("\n装備の複製テスト: " + (cloneTest ? "OK" : "NG"));

        // 比較テスト
        boolean compareTest = sword.compareTo(shield) > 0 ? false : true; // sword > shield
        System.out.println("装備の比較テスト: " + (compareTest ? "OK" : "NG"));

        // ソートテスト
        hero.sortEquipments();
        boolean sortTest = true;
        int lastPower = Integer.MAX_VALUE;
        for (Equipment eq : hero.equipments) {
            if (eq.getPower() > lastPower) {
                sortTest = false;
                break;
            }
            lastPower = eq.getPower();
        }
        System.out.println("装備の強さソート: " + (sortTest ? "OK" : "NG"));
    }
}
