public class Main1 {
    public static void main(String[] args) {
        Pet pet = new Pet();

        // 初期値設定
        pet.setName("ポチ");
        pet.setEnergy(100);

        // 出力
        System.out.println(pet.getName() + "を生み出しました！");
        System.out.println("初期体力：" + pet.getEnergy());

        // 行動と出力
        pet.eat();
        pet.showEnergy();

        pet.play();
        pet.showEnergy();
    }
}
