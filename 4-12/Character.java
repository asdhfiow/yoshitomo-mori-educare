public class Character implements Comparable <Character>{
    int HP;
    int attack;
    String name;

    public Character(String name, int HP, int attack){
        this.name = name;
        this.HP = HP;
        this.attack = attack;
    }
    public int getBattlePower(){
        return HP + attack;
    }
    // 戦闘力を後順でソート
    @Override
    public int compareTo(Character other){
        return other.getBattlePower() - this.getBattlePower();
    }
    
    // キャラクター情報を文字列で返す
    @Override
    public String toString(){
        return name + "(HP:" + HP + "攻撃力：" + getBattlePower() + ")";
    }
}
