package dk.kpedersenIC3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Armor extends Item{

    private final HashSet<String> ArmorTypes;
    private String ArmorType;

    public Armor(){
        super();
        ArmorTypes = new HashSet<>(
                new ArrayList<>(
                        Arrays.asList(
                                "Cloth",
                                "Leather",
                                "Mail",
                                "Plate"
                        )
                )
        );
    }

    public void setArmorType(String armorType) {
        if(this.ArmorTypes.contains(armorType)) ArmorType = armorType;
    }

    public String getArmorType() {
        return ArmorType;
    }
}
