package dk.kpedersenIC3;
//Class type PrimaryAttribute makes it easier to add and update attributes.
public class PrimaryAttribute {
    //Has properties Strength, Dexterity and Intelligence
    private Double Strength;
    private Double Dexterity;
    private Double Intelligence;
    //Needs input on initialization.
    public PrimaryAttribute(Double strength, Double dexterity, Double intelligence){
        this.Strength = strength;
        this.Dexterity = dexterity;
        this.Intelligence = intelligence;
    }
    //Only has getters as attributes are set on init.
    public Double getStrength() {
        return Strength;
    }
    public Double getDexterity() {
        return Dexterity;
    }
    public Double getIntelligence() {
        return Intelligence;
    }
}
