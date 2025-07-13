public class Main2 {
    public static void main(String[] args) {
        Monster monster1 = new Monster("スライム", 5);
        Monster monster2 = new Monster("スライム", 5);
        Monster monster3 = new Monster("スライム", 10);

        // monster1とmonster2の比較
        if(monster1.equals(monster2)) {
            System.out.println(monster1.name + "Lv." + monster1.level + " と " + monster2.name + "Lv." + monster2.level + " は同じモンスターです");
        } else {
            System.out.println(monster1.name + "Lv." + monster1.level + " と " + monster2.name + "Lv." + monster2.level + " は違うモンスターです");
        }

        // monster1とmonster3の比較
        if(monster1.equals(monster3)) {
            System.out.println(monster1.name + "Lv." + monster1.level + " と " + monster3.name + "Lv." + monster3.level + " は同じモンスターです");
        } else {
            System.out.println(monster1.name + "Lv." + monster1.level + " と " + monster3.name + "Lv." + monster3.level + " は違うモンスターです");
        }
    }
}