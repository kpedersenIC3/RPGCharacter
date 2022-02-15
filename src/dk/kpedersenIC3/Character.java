package dk.kpedersenIC3;
import java.util.Locale;
//Main character class
public abstract class Character{
    //declaration of character attributes
    private final String Name;
    private Integer Level;
    private PrimaryAttribute BaseAttribute;
    private PrimaryAttribute TotalAttribute;
    private final Equipment Equipment;
    //Set name on construction and initialize an empty equipment type.
    //All characters star at level 1.
    public Character(String Name) {
        this.Name = Name;
        this.Equipment = new Equipment();
        this.Level = 1;
    }
    //Methods to be overridden in each character class.
    //This is done to handle individual character class functionality.
    public void levelUp(){}
    public Double DPS(){
        return 0.0;
    }
    public void equipItem(Item item) throws InvalidItemException {
    }


    //getters and setters.
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


    //Sweet looking printout of character stats
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
                + "\nWeapon: "
                + String.format(Equipment.getEquipment().get(Slot.WEAPON) == null ? "\nNo Weapon Equipped":Equipment.getEquipment().get(Slot.WEAPON).toString() )
                + "\nArmor: "
                + String.format(Equipment.getEquipment().get(Slot.HEAD) == null ? "\nNo Head Armor Equipped":Equipment.getEquipment().get(Slot.HEAD).toString() )
                + String.format(Equipment.getEquipment().get(Slot.BODY) == null ? "\nNo Body Armor Equipped":Equipment.getEquipment().get(Slot.BODY).toString() )
                + String.format(Equipment.getEquipment().get(Slot.LEGS) == null ? "\nNo Leg Armor Equipped":Equipment.getEquipment().get(Slot.LEGS).toString() ) + "\n";

    }
}
