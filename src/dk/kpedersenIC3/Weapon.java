package dk.kpedersenIC3;

public class Weapon extends Item{
    public Weapon() {
        super();
    }
    //Override the toString() method for a sweet looking stats printout.
    @Override
    public String toString() {
        return  "\nSlot: " + getSlot() +
                "\nType: " + getWeaponType() +
                "\nName: " + getName() +
                "\nRequired Level: " + getRequiredLevel() +
                "\nDamage: " + getDamage() +
                "\nAttack Speed: " + getAttackSpeed() +
                "\nDPS: " + getWeaponDPS();


    }


}
