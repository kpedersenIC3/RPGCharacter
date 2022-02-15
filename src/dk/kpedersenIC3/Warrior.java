package dk.kpedersenIC3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Warrior extends Character{
    HashSet<String> ValidItems;
    public Warrior(String name){
        super(name);
        setBaseAttribute(new PrimaryAttribute(5.,2.,1.) );
        setTotalAttribute(getBaseAttribute());
        ValidItems = new HashSet<>(new ArrayList<String>(Arrays.asList(
                WeaponType.AXE,
                WeaponType.HAMMER,
                WeaponType.SWORD,
                ArmorType.MAIL,
                ArmorType.PLATE
        )));
    }

    @Override
    public void levelUp() {
        setLevel(getLevel()+1);
        setBaseAttribute(new PrimaryAttribute(
                getBaseAttribute().getStrength()+3.,
                getBaseAttribute().getDexterity()+2.,
                getBaseAttribute().getIntelligence()+1.));
        setTotalAttribute(getBaseAttribute());
    }

    @Override
    public Double DPS() {
        Double weapondps = 1.;
        Double multiplier = (1. + getTotalAttribute().getStrength()/100.);
        if(getEquipment().getEquipment().get(Slot.WEAPON) != null){
            weapondps = getEquipment().getEquipment().get(Slot.WEAPON).getWeaponDPS();
        }
        return weapondps*multiplier;
    }
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
            setTotalAttribute(new PrimaryAttribute(
                    getTotalAttribute().getStrength() + item.getBaseAttribute().getStrength(),
                    getTotalAttribute().getDexterity() + item.getBaseAttribute().getDexterity(),
                    getTotalAttribute().getIntelligence() + item.getBaseAttribute().getIntelligence()
            ));
        }

    }

}

