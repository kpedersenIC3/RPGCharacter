package dk.kpedersenIC3;

import java.util.Locale;

public abstract class Character{

    private final String Name;
    private Integer Level;
    private PrimaryAttribute BaseAttribute;
    private PrimaryAttribute TotalAttribute;
    private Equipment Equipment;

    public Character(String Name) {
        this.Name = Name;
        this.Equipment = new Equipment();
        Level = 1;

    }

    public void levelUp(){}
    public Double DPS(){
        return 0.0;
    }

    public void equipItem(Item item){
        this.Equipment.getEquipment().put(item.getSlot(),item);
        System.out.println();
        if(item.getClass().getSimpleName().equals("Armor") ) {
            setTotalAttribute(new PrimaryAttribute(
                    getBaseAttribute().getStrength() + item.getArmorAttribute().getStrength(),
                    getBaseAttribute().getDexterity() + item.getArmorAttribute().getDexterity(),
                    getBaseAttribute().getIntelligence() + item.getArmorAttribute().getIntelligence()
            ));
        }
    }

    public String getName() {
        return Name;
    }

    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }

    public PrimaryAttribute getBaseAttribute() {
        return BaseAttribute;
    }

    public void setBaseAttribute(PrimaryAttribute baseAttribute) {
        BaseAttribute = baseAttribute;
    }

    public PrimaryAttribute getTotalAttribute() {
        return TotalAttribute;
    }

    public void setTotalAttribute(PrimaryAttribute totalAttribute) {
        this.TotalAttribute = totalAttribute;
    }

    public dk.kpedersenIC3.Equipment getEquipment() {
        return Equipment;
    }

    @Override
    public String toString() {
        return "Character: " + Name
                + "\nLevel: " + Level + " "
                + Character.super.getClass().getSimpleName()
                + "\nStrength: " + TotalAttribute.getStrength()
                + "\nDexterity: " + TotalAttribute.getDexterity()
                +"\nIntelligence: " + TotalAttribute.getIntelligence()
                +"\nDPS: " + String.format(Locale.ENGLISH,"%.1f",DPS())
                +"\n*****Equipment*****"
                + "\nWeapon: " + Equipment.getEquipment().get(Slot.WEAPON)
                + "\nArmor: "
                + Equipment.getEquipment().get(Slot.HEAD) + "\n"
                + Equipment.getEquipment().get(Slot.BODY) + "\n"
                + Equipment.getEquipment().get(Slot.LEGS) + "\n";

    }
}
