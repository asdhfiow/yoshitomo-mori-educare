public class Main1 {
    public static void main(String[] args){
        GameCharacter gc = new GameCharacter();
        gc.name = "剣士アレックス";

        // 武器を作って装備
        Weapon w = new Weapon();
        w.name = "魔法の剣";
        w.power = 100;

        gc.weapon = w;

        System.out.println(gc.name + "は" + gc.weapon.name + "を装備しています");
    }
}