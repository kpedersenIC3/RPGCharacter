package dk.kpedersenIC3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Armor extends Item{

    private final HashSet<String> ArmorTypes = new HashSet<>(
            new ArrayList<>(
                    Arrays.asList(
                            dk.kpedersenIC3.ArmorType.CLOTH,
                            dk.kpedersenIC3.ArmorType.LEATHER,
                            dk.kpedersenIC3.ArmorType.MAIL,
                            dk.kpedersenIC3.ArmorType.PLATE
                    )
            )
    );
    private static String ArmorType;
    private static PrimaryAttribute BaseAttribute;

    public Armor(){
        super();
    }

    public static String getArmorType() {
        return ArmorType;
    }

    public void setArmorType(String armorType) {
        if(this.ArmorTypes.contains(armorType)) ArmorType = armorType;
    }

    public static PrimaryAttribute getBaseAttribute() {
        return BaseAttribute;
    }

    public void setBaseAttribute(PrimaryAttribute baseAttribute) {
        BaseAttribute = baseAttribute;
    }

    @Override
    public  String toString() {
        return "\nSlot: " + getSlot() +
                "\nType: " + getArmorType() +
                "\nName: " + getName() +
                "\nRequired Level: " + getRequiredLevel() +
                "\n***Abilities***" +
                "\nStrength: " + BaseAttribute.getStrength() +
                "\nDexterity: " + BaseAttribute.getDexterity() +
                "\nIntelligence:" + BaseAttribute.getIntelligence();
    }
}
