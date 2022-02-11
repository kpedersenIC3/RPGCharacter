package dk.kpedersenIC3;

public class PrimaryAttribute {
    private Double Strength;
    private Double Dexterity;
    private Double Intelligence;

    public PrimaryAttribute(Double strength, Double dexterity, Double intelligence){
        this.Strength = strength;
        this.Dexterity = dexterity;
        this.Intelligence = intelligence;
    }

    public Double getStrength() {
        return Strength;
    }

    public void setStrength(Double strength) {
        Strength = strength;
    }

    public Double getDexterity() {
        return Dexterity;
    }

    public void setDexterity(Double dexterity) {
        Dexterity = dexterity;
    }

    public Double getIntelligence() {
        return Intelligence;
    }

    public void setIntelligence(Double intelligence) {
        Intelligence = intelligence;
    }
}
