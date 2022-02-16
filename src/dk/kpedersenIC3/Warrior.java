package dk.kpedersenIC3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Warrior extends Character{
    //Property valid items is part of individual character classes.
    HashSet<String> ValidItems;
    //constructor that sets the individual attributes and valid items set on init.
    public Warrior(String name){
        super(name);
        setBaseAttribute(new PrimaryAttribute(5.,2.,1.) );
        setTotalAttribute();
        ValidItems = new HashSet<>(new ArrayList<String>(Arrays.asList(
                WeaponType.AXE,
                WeaponType.HAMMER,
                WeaponType.SWORD,
                ArmorType.MAIL,
                ArmorType.PLATE
        )));
    }
    //individual level up for warrior. Increases level by 1 and increases attributes.
    @Override
    public void levelUp() {
        setLevel(getLevel()+1);
        setBaseAttribute(new PrimaryAttribute(
                getBaseAttribute().getStrength()+3.,
                getBaseAttribute().getDexterity()+2.,
                getBaseAttribute().getIntelligence()+1.));
        setTotalAttribute();
    }
    //individual Damage Per Second. Checks if weapon is equipped and
    // multiplier uses strength in Warrior Class.
    @Override
    public Double DPS() {
        Double weapondps = 1.;
        Double multiplier = (1. + getTotalAttribute().getStrength()/100.);
        if(getEquipment().getEquipment().get(Slot.WEAPON) != null){
            weapondps = getEquipment().getEquipment().get(Slot.WEAPON).getWeaponDPS();
        }
        return weapondps*multiplier;
    }
    //When equipping items, throw InvalidItemException is level is too low,
    //or if Item isn't in ValidItems set.
    //Otherwise, equip item and recalculate total attributes if armor is equipped.
    @Override
    public void equipItem(Item item) throws InvalidItemException {
        if (!ValidItems.contains(item.getType())) {
            throw new InvalidItemException("Invalid item type " +
                    "for class " + getClass().getSimpleName());
        }
        if (!(getLevel() >= item.getRequiredLevel())) {
            throw new InvalidItemException("Cannot equip item at current level!");
        }
        getEquipment().getEquipment().put(item.getSlot(), item);
        if (item.getClass().getSimpleName().equals("Armor")) {
            setTotalAttribute();
        }

    }

}

