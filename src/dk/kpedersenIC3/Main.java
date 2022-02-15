package dk.kpedersenIC3;

public class Main {

    public static void main(String[] args) throws InvalidItemException{
        //Example Hero
        Warrior warrior = new Warrior("Conan");

        //Create a weapon
        Weapon rustySword = new Weapon();
        rustySword.setName("Rusty Nail");
        rustySword.setRequiredLevel(1);
        rustySword.setSlot(Slot.WEAPON);
        rustySword.setWeaponType(WeaponType.SWORD);
        rustySword.setAttackSpeed(2.2);
        rustySword.setDamage(4.);

        //create some Armor
        Armor chainMail = new Armor();
        chainMail.setName("Rusty Mail");
        chainMail.setRequiredLevel(2);
        chainMail.setSlot(Slot.BODY);
        chainMail.setArmorType(ArmorType.MAIL);
        chainMail.setBaseAttribute(new PrimaryAttribute(1.,3.,0.));

        //Equip sword
        warrior.equipItem(rustySword);

        //Level up to equip Armor
        warrior.levelUp();
        warrior.equipItem(chainMail);

        //Printout Stats
        System.out.println(warrior);

    }

}
