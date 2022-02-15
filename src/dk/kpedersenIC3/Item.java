package dk.kpedersenIC3;


public abstract class Item{

    private String Name;
    private Integer RequiredLevel;
    private String Slot;

    private String ArmorType;
    private PrimaryAttribute BaseAttribute;

    private String WeaponType;
    private Double Damage;
    private Double AttackSpeed;


    public Item(){
    }

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
