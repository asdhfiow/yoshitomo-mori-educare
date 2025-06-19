public class Pet {
    //フィールド
    String name;
    int energy;

    //メソッド
    void setName(){
        // 名前を設定するメソッド
        this.name = "ポチ"; // 例として固定の名前を設定
    }
    void setEnergy(){
        // エネルギーを設定するメソッド
        this.energy = 100; // 例として初期エネルギーを100に設定
    }
    void getName(){
        System.out.println(name + "を生み出しました！");
    }
    void getEnergy(){
        System.out.println("初期体力：" + energy);
    }
    void eat() {
        energy += 10;
        System.out.println(name + "は食事をして元気になった!");
    }

    void play() {
        energy -= 20;
        System.out.println(name + "は遊んで疲れた!");
    }

    void showEnergy() {
        System.out.println("現在の体力：" + energy);
    }
    
}
