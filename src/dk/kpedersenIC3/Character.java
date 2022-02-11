package dk.kpedersenIC3;

import java.util.HashMap;

public abstract class Character{

    private String Name;
    private Integer Level;
    private HashMap<String,Double> PrimaryAttributes;


    public Character(String Name) {
        this.Name = Name;
        Level = 1;
        PrimaryAttributes = new HashMap<>();
    }

    public void levelUp(){};

//    public void equipItem(Item item){
//        if(item.getRequiredLevel()<= getLevel()) {
//            getEquipment().put(item.getSlot(), item);
//        }
//    }
    public String getName() {
        return Name;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }




    public HashMap<String, Double> getPrimaryAttributes() {
        return PrimaryAttributes;
    }

    public void setPrimaryAttributes(Double strength, Double dexterity, Double intelligence) {
        this.PrimaryAttributes.put("Strength",strength);
        this.PrimaryAttributes.put("Dexterity",dexterity);
        this.PrimaryAttributes.put("Intelligence",intelligence);
    }

    @Override
    public String toString() {
        return "Character: " + Name
                + "\nLevel: " + Level + " "
                + Character.super.getClass().getSimpleName()
                + "\nStrength: " + getPrimaryAttributes().get("Strength")
                + "\nDexterity: " + getPrimaryAttributes().get("Dexterity")
                +"\nIntelligence: " + getPrimaryAttributes().get("Intelligence");
    }
}
