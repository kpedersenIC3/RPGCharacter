package dk.kpedersenIC3;

public abstract class Character {

    private String Name;
    private Double Strength;
    private Double Dexterity;
    private Double Intelligence;
    private Integer Level;

    public Character(Double Strength, Double Dexterity, Double Intelligence, String Name) {
        this.Strength = Strength;
        this.Dexterity = Dexterity;
        this.Intelligence = Intelligence;
        this.Name = Name;
        this.Level = 1;
    }

    public void levelUp(){

        setLevel(getLevel()+1);

        String characterClass = Character.super.getClass().getSimpleName();

        switch (characterClass) {
            case "Warrior":
                setStrength(getStrength()+3.);
                setDexterity(getDexterity()+2.);
                setIntelligence(getIntelligence()+1.);
                break;
            case "Mage":
                setStrength(getStrength()+1.);
                setDexterity(getDexterity()+1.);
                setIntelligence(getIntelligence()+5.);
                break;
            case "Rogue":
                setStrength(getStrength()+1.);
                setDexterity(getDexterity()+4.);
                setIntelligence(getIntelligence()+1.);
                break;
            case "Ranger":
                setStrength(getStrength()+1.);
                setDexterity(getDexterity()+5.);
                setIntelligence(getIntelligence()+1.);
                break;
            default:
                break;


        }

    }
    public Double getDexterity() {
        return Dexterity;
    }

    public Double getIntelligence() {
        return Intelligence;
    }

    public Double getStrength() {
        return Strength;
    }

    public Integer getLevel() {
        return Level;
    }

    public String getName() {
        return Name;
    }

    public void setDexterity(Double dexterity) {
        Dexterity = dexterity;
    }

    public void setIntelligence(Double intelligence) {
        Intelligence = intelligence;
    }

    public void setStrength(Double strength) {
        Strength = strength;
    }
    public void setLevel(Integer level) {
        Level = level;
    }


    @Override
    public String toString() {
        return "Character: " + Name
                + "\nClass: " + Character.super.getClass().getSimpleName()
                + "\nStrength: " + Strength
                + "\nDexterity: " + Dexterity +"\nIntelligence: " + Intelligence
                + "\nLevel: " + Level;
    }
}
