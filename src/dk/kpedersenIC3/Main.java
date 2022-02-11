package dk.kpedersenIC3;

public class Main {

    public static void main(String[] args) {

        //Create one of each class
        Mage mage = new Mage("Liselotte");
        Ranger ranger = new Ranger("Claus-Allan");
        Rogue rogue = new Rogue("Morten");
        Warrior warrior = new Warrior("Carsten");
        //check if levels up
        System.out.println(mage);
        mage.levelUp();
        System.out.println(mage);

        System.out.println(ranger);
        ranger.levelUp();
        System.out.println(ranger);

        System.out.println(rogue);
        rogue.levelUp();
        System.out.println(rogue);

        System.out.println(warrior);
        warrior.levelUp();
        System.out.println(warrior);
//
        //check weapon
        Weapon testWeapon = new Weapon();
        testWeapon.setWeaponType(WeaponType.AXE);
        testWeapon.setName("Cutters Axe");
        testWeapon.setSlot(Slot.WEAPON);
        testWeapon.setRequiredLevel(2);
        testWeapon.setDamage(8.);
        testWeapon.setAttackSpeed(2.3);
        System.out.println(testWeapon);

        Armor testArmor = new Armor();
        testArmor.setArmorType(ArmorType.CLOTH);
        testArmor.setName("Shabby Cloth");
        testArmor.setSlot(Slot.HEAD);
        testArmor.setRequiredLevel(1);
        testArmor.setBaseAttribute(new PrimaryAttribute(1.,1.,1.));
        System.out.println(testArmor);
    }

}
