import java.util.Objects;

public class Monster {
    private String name;
    private int level;

    public Monster(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Monster)) return false;
        Monster other = (Monster) obj;
        return this.name.equals(other.name) && this.level == other.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level);
    }

    @Override
    public String toString() {
        return name + "Lv." + level;
    }
}
