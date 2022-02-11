package dk.kpedersenIC3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Armor extends Item{

    private final HashSet<String> ArmorTypes = new HashSet<>(
            new ArrayList<>(
                    Arrays.asList(
                            "CLOTH",
                            "LEATHER",
                            "MAIL",
                            "PLATE"
                    )
            )
    );
    private String ArmorType;
    private PrimaryAttribute BaseAttribute;

    public Armor(){
        super();
    }

    public String getArmorType() {
        return ArmorType;
    }

    public void setArmorType(String armorType) {
        if(this.ArmorTypes.contains(armorType)) ArmorType = armorType;
    }

    public PrimaryAttribute getBaseAttribute() {
        return BaseAttribute;
    }

    public void setBaseAttribute(PrimaryAttribute baseAttribute) {
        BaseAttribute = baseAttribute;
    }

    @Override
    public  String toString() {
        return "\nSlot: " + getSlot() +
                "\nType: " + getArmorType() +
                "\n***Abilities***" +
                "\nStrength: " + BaseAttribute.getStrength() +
                "\nDexterity: " + BaseAttribute.getDexterity() +
                "\nIntelligence:" + BaseAttribute.getIntelligence();
    }
}
