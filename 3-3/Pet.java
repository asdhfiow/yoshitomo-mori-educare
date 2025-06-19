public class Pet {
    // フィールド
    private String name;
    private int energy;

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void eat() {
        energy += 10;
        System.out.println(name + "は食事をして元気になった!");
    }

    public void play() {
        energy -= 20;
        System.out.println(name + "は遊んで疲れた!");
    }

    public void showEnergy() {
        System.out.println("現在の体力：" + energy);
    }
}

