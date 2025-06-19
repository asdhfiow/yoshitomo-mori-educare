public class Main1 {
    public static void main(String[] args){

        Pet pet = new Pet(); //インスタンスの生成  

        //初期値の設定
        pet.setName(); //名前を設定
        pet.setEnergy(); //エネルギーを設定

        //メソッドの呼び出し
        pet.getName();     //名前を設定
        pet.getEnergy();   //初期体力を表示
        pet.eat();         //食事をして体力を回復
        pet.showEnergy();  //体力を表示
        pet.play();        //遊んで体力を消費
        pet.showEnergy();  //体力を表示
    }
}
