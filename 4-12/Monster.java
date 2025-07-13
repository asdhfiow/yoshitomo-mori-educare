public class Monster {
    String name;
    int level;

    public Monster(String name, int level){
        this.name = name;
        this.level = level;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(!(obj instanceof Monster)) return false;
        Monster other = (Monster) obj;
        return this.name.equals(other.name) && this.level == other.level;
    }
}
