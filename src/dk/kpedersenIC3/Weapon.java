package dk.kpedersenIC3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.SplittableRandom;


public class Weapon extends Item{

    private static HashSet<String> WeaponTypes = new HashSet<>(new ArrayList<String>(Arrays.asList(
            "AXE",
            "BOW",
            "DAGGER",
            "HAMMER",
            "STAFF",
            "SWORD",
            "WAND"
            )));
    private static String WeaponType;
    private static Integer Damage;
    private static Double AttackSpeed;
    public Weapon(){
        super();
    };

    public static void setWeaponType(String weaponType) {
        if(WeaponTypes.contains(weaponType)){
            WeaponType = weaponType;
        }
    }

    public static void setDamage(Integer damage) {
        Damage = damage;
    }

    public static void setAttackSpeed(Double attackSpeed) {
        AttackSpeed = attackSpeed;
    }

    public static String getWeaponType() {
        return WeaponType;
    }

    public static Integer getDamage() {
        return Damage;
    }

    public static Double getAttackSpeed() {
        return AttackSpeed;
    }

}
