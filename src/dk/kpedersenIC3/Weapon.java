package dk.kpedersenIC3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;



public class Weapon extends Item{

    private final HashSet<String> WeaponTypes;
    private String WeaponType;
    private Double Damage;
    private Double AttackSpeed;
    public Weapon(){
        super();
        WeaponTypes = new HashSet<>(new ArrayList<String>(Arrays.asList(
                "AXE",
                "BOW",
                "DAGGER",
                "HAMMER",
                "STAFF",
                "SWORD",
                "WAND"
                )));
    };

    public void setWeaponType(String weaponType) {
        if(this.WeaponTypes.contains(weaponType)) WeaponType = weaponType;
    }
    public String getWeaponType() {
        return WeaponType;
    }

    public void setDamage(Double damage) {
        this.Damage = damage;
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

    public Double DPS() {
        return getDamage()*getAttackSpeed();
    }

    @Override
    public String toString() {
        return
                "\nType: " + getWeaponType() +
                        "\nName: " + getName() +
                        "\nRequired Level: " + getRequiredLevel() +
                        "\nSlot: " + getSlot() +
                        "\nDamage: " + getDamage() +
                        "\nAttack Speed: " + getAttackSpeed() +
                        "\nDPS: " + DPS();


    }


}
