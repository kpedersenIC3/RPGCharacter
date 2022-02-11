package dk.kpedersenIC3;


public abstract class Item {

    private String Name;
    private Integer RequiredLevel;
    private String Slot;
    public Item(){

    }


    public void setName(String name) {
        this.Name = name;
    }
    public void setRequiredLevel(Integer requiredLevel) {
        this.RequiredLevel = requiredLevel;
    }

//    public void setSlot(String slot) {
//        if(Character.getEquipment().containsKey(slot)) {
//            this.Slot = slot;
//        }
//    }

    public String getName() {
        return Name;
    }
    public Integer getRequiredLevel() {
        return RequiredLevel;
    }

    public String getSlot() {
        return Slot;
    }


    @Override
    public String toString() {
        return
                "\nType: " + Weapon.getWeaponType() +
                "\nName: " + getName() +
                "\nRequired Level: " + getRequiredLevel() +
                "\nSlot: " + getSlot() +
                "\nDamage: " + Weapon.getDamage() +
                "\nAttack Speed: " + Weapon.getAttackSpeed();


    }


}
