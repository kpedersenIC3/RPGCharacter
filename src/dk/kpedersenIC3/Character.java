package dk.kpedersenIC3;

public abstract class Character{

    private final String Name;
    private Integer Level;
    private PrimaryAttribute BaseAttribute;


    public Character(String Name) {
        this.Name = Name;
        Level = 1;
    }

    public void levelUp(){}

    public String getName() {
        return Name;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }

    public PrimaryAttribute getBaseAttribute() {
        return BaseAttribute;
    }

    public void setBaseAttribute(PrimaryAttribute baseAttribute) {
        BaseAttribute = baseAttribute;
    }

    @Override
    public String toString() {
        return "Character: " + Name
                + "\nLevel: " + Level + " "
                + Character.super.getClass().getSimpleName()
                + "\nStrength: " + BaseAttribute.getStrength()
                + "\nDexterity: " + BaseAttribute.getDexterity()
                +"\nIntelligence: " + BaseAttribute.getIntelligence();
    }
}
