// Equipment.java
public class Equipment implements Cloneable, Comparable<Equipment> {
    private String name;
    private int attack;
    private int defense;

    public Equipment(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    public int getPower() {
        return attack + defense;
    }

    @Override
    public Equipment clone() {
        try {
            return (Equipment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Equipment e = (Equipment) obj;
        return this.attack == e.attack && this.defense == e.defense && this.name.equals(e.name);
    }

    @Override
    public int compareTo(Equipment o) {
        return Integer.compare(o.getPower(), this.getPower()); // 降順
    }

    @Override
    public String toString() {
        return name + " (攻撃力:" + attack + " 防御力:" + defense + ")";
    }
}