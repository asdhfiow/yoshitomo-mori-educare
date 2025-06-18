public class Main1 {
    public static void main(String[] args){

        Pet pet = new Pet(); //インスタンスの生成
        pet.name = "ポチ";
        pet.energy = 100;

        System.out.println(pet.name + "を生み出しました!");
        System.out.println("初期体力：" + pet.energy);

        //メソッドの呼び出し
        pet.eat();
        pet.play();
    }
}
