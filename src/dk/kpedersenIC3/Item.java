package dk.kpedersenIC3;


public abstract class Item{

    private String Name;
    private Integer RequiredLevel;
    private String Slot;


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

    public PrimaryAttribute getArmorAttribute() {
        return Armor.getBaseAttribute();
    }

    public Double getWeaponDPS(){
        return Weapon.weaponDPS();
    }

    public String getType() {
        if(getSlot().equals(dk.kpedersenIC3.Slot.WEAPON)){
            return Weapon.getWeaponType();
        }
        return Armor.getArmorType();
    }
}
