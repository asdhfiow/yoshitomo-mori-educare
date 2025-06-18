public class Pet {
    //フィールド
    String name;
    int energy;

    void eat() {
        energy += 10;
        System.out.println(name + "は食事をして元気になった!");
        showEnergy();
    }

    void play() {
        energy -= 20;
        System.out.println(name + "は遊んで疲れた!");
        showEnergy();
    }

    void showEnergy() {
        System.out.println("現在の体力：" + energy);
    }
}
