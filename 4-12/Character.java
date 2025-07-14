public class Character implements Comparable <Character>{
   private int hp;
   private int attack;
   private String name;

    public Character(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }
    public int getBattlePower(){
        return hp + attack;
    }
    // 戦闘力を後順でソート
    @Override
    public int compareTo(Character other){
        return Integer.compare(other.getBattlePower(), - this.getBattlePower());
    }
    
    // キャラクター情報を文字列で返す
    @Override
    public String toString(){
        return name + "(HP:" + hp + "攻撃力：" + attack + ")";
    }
}
