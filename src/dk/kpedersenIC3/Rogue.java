package dk.kpedersenIC3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Rogue extends Character{
    HashSet<String> ValidItems;
    public Rogue(String name){
        super(name);
        setBaseAttribute(new PrimaryAttribute(2.,6.,1.) );
        ValidItems = new HashSet<>(new ArrayList<String>(Arrays.asList(
                WeaponType.DAGGER,
                WeaponType.SWORD,
                ArmorType.LEATHER,
                ArmorType.MAIL
        )));
    }

    @Override
    public void levelUp() {
        setLevel(getLevel()+1);
        setBaseAttribute(new PrimaryAttribute(
                getBaseAttribute().getStrength()+1.,
                getBaseAttribute().getDexterity()+4.,
                getBaseAttribute().getIntelligence()+1.));

    }
    @Override
    public Double DPS() {
        Double weapondps = 1.;
        Double multiplier = (1. + getTotalAttribute().getDexterity()/100.);
        if(getEquipment().getEquipment().get(Slot.WEAPON) != null){
            weapondps = getEquipment().getEquipment().get(Slot.WEAPON).getWeaponDPS();
        }
        return weapondps*multiplier;
    }


    @Override
    public void equipItem(Item item) throws InvalidItemException {
        if(!ValidItems.contains(item.getType())) {
            throw new InvalidItemException("Invalid item type " +
                    "for class " + getClass().getSimpleName());
        }
        if(!(getLevel()>= item.getRequiredLevel()) ) {
            throw new InvalidItemException("Cannot equip item at current level!");
        }
        getEquipment().getEquipment().put(item.getSlot(), item);
        if (item.getClass().getSimpleName().equals("Armor")) {
            setTotalAttribute(new PrimaryAttribute(
                    getBaseAttribute().getStrength() + getTotalAttribute().getStrength() + item.getArmorAttribute().getStrength(),
                    getBaseAttribute().getDexterity() + getTotalAttribute().getDexterity() + item.getArmorAttribute().getDexterity(),
                    getBaseAttribute().getIntelligence() + getTotalAttribute().getIntelligence() + item.getArmorAttribute().getIntelligence()
            ));
        }
    }
}
