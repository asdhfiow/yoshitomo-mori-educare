import java.util.ArrayList;
import java.util.List;

public class PartyMember implements Cloneable {
    private String name;
    private List<String> skills;

    public PartyMember(String name) {
        this.name = name;
        this.skills = new ArrayList<>();
    }

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void showSkills() {
        System.out.println("元のキャラクター「" + name + "」のスキル: " + skills);
    }

    @Override
    public PartyMember clone() {
        try {
            PartyMember cloned = (PartyMember) super.clone();
            cloned.skills = new ArrayList<>(this.skills); 
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); 
        }
    }
}
