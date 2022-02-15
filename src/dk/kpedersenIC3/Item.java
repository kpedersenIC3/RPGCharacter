package dk.kpedersenIC3;

//Item class collects functionality of armor and weapons.
public abstract class Item{
    //Shared properties.
    private String Name;
    private Integer RequiredLevel;
    private String Slot;
    //armor specific properties.
    private String ArmorType;
    private PrimaryAttribute BaseAttribute;
    //weapon specific properties.
    private String WeaponType;
    private Double Damage;
    private Double AttackSpeed;


    public Item(){
    }
    //setters and getters. No checks here if weapon or armor. It is safe to
    //assume a "correct" data input.
    public void setName(String name) {this.Name = name;}

    public String getName() {
        return Name;
    }

    public void setRequiredLevel(Integer requiredLevel) {
        this.RequiredLevel = requiredLevel;
    }

    public Integer getRequiredLevel() {
        return RequiredLevel;
    }

    public void setSlot(String slot) {
        this.Slot = slot;
    }

    public String getSlot() {return Slot;}

    public void setBaseAttribute(PrimaryAttribute baseAttribute) {
        BaseAttribute = baseAttribute;
    }
    public PrimaryAttribute getBaseAttribute() {
        return BaseAttribute;
    }

    public Double getWeaponDPS(){
        return getDamage()*getAttackSpeed();
    }

    public void setArmorType(String armorType) {
        ArmorType = armorType;
    }
    public String getArmorType() {
        return ArmorType;
    }

    public void setWeaponType(String weaponType) {
        WeaponType = weaponType;
    }
    public String getWeaponType() {
        return WeaponType;
    }

    //collective type getter that checks for slot and returns a valid type.
    public String getType() {
        if(this.getSlot().equals(dk.kpedersenIC3.Slot.WEAPON)){
            return getWeaponType();
        }
        return getArmorType();
    }

    public void setDamage(Double damage) {
        Damage = damage;
    }

    public Double getDamage() {
        return Damage;
    }

    public void setAttackSpeed(Double attackSpeed) {
        AttackSpeed = attackSpeed;
    }

    public Double getAttackSpeed() {
        return AttackSpeed;
    }
}
