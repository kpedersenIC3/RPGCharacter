package dk.kpedersenIC3;

public class Main {

    public static void main(String[] args) throws InvalidItemException {

        //Create one of each class
        Mage mage = new Mage("Liselotte");
        Ranger ranger = new Ranger("Claus-Allan");
        Rogue rogue = new Rogue("Morten");
        Warrior warrior = new Warrior("Carsten");



//
        //check weapon
        Weapon testWeapon = new Weapon();
        testWeapon.setWeaponType(WeaponType.STAFF);
        testWeapon.setName("Cutters Axe");
        testWeapon.setSlot(Slot.WEAPON);
        testWeapon.setRequiredLevel(2);
        testWeapon.setDamage(8.);
        testWeapon.setAttackSpeed(2.3);


        Armor testArmor = new Armor();
        testArmor.setArmorType(ArmorType.CLOTH);
        testArmor.setName("Shabby Cloth");
        testArmor.setSlot(Slot.HEAD);
        testArmor.setRequiredLevel(2);
        testArmor.setBaseAttribute(new PrimaryAttribute(10.,10.,10.));

        //test equipment
        mage.levelUp();
        mage.equipItem(testWeapon);
        mage.equipItem(testArmor);
        mage.unequipItem(testWeapon);
        mage.unequipItem(testArmor);
        System.out.println(mage);
    }

}
