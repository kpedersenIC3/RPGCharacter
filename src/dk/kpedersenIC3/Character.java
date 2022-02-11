package dk.kpedersenIC3;

public abstract class Character{

    private final String Name;
    private Integer Level;
    private PrimaryAttribute BaseAttribute;
    private Equipment Equipment;

    public Character(String Name) {
        this.Name = Name;
        this.Equipment = new Equipment();
        Level = 1;

    }

    public void levelUp(){}

    public void equipItem(Item item){
        this.Equipment.getEquipment().put(item.getSlot(),item);
        System.out.println();
        if(item.getClass().getSimpleName().equals("Armor") ) {
            setBaseAttribute(new PrimaryAttribute(
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

    @Override
    public String toString() {
        return "Character: " + Name
                + "\nLevel: " + Level + " "
                + Character.super.getClass().getSimpleName()
                + "\nStrength: " + BaseAttribute.getStrength()
                + "\nDexterity: " + BaseAttribute.getDexterity()
                +"\nIntelligence: " + BaseAttribute.getIntelligence()
                +"\n*****Equipment*****"
                + "\nWeapon: " + Equipment.getEquipment().get(Slot.WEAPON)
                + "\nArmor: "
                + Equipment.getEquipment().get(Slot.HEAD) + "\n"
                + Equipment.getEquipment().get(Slot.BODY) + "\n"
                + Equipment.getEquipment().get(Slot.LEGS) + "\n";

    }
}
