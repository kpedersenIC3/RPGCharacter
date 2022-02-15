package dk.kpedersenIC3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    Warrior warrior;
    Weapon testWeapon;
    Armor testPlateBody;
    Weapon testBow;
    Armor testClothHead;

    @BeforeEach
    void setUp() {
        warrior = new Warrior("test_name");

        testWeapon = new Weapon();
        testWeapon.setName("Common Axe");
        testWeapon.setSlot(Slot.WEAPON);
        testWeapon.setWeaponType(WeaponType.AXE);
        testWeapon.setDamage(7.);
        testWeapon.setAttackSpeed(1.1);
        testWeapon.setRequiredLevel(1);

        testPlateBody = new Armor();
        testPlateBody.setName("Common Plate Body Armor");
        testPlateBody.setRequiredLevel(1);
        testPlateBody.setSlot(Slot.BODY);
        testPlateBody.setArmorType(ArmorType.PLATE);
        testPlateBody.setBaseAttribute(new PrimaryAttribute(1.,0.,0.) );

        testBow = new Weapon();
        testBow.setName("Common Bow");
        testBow.setRequiredLevel(1);
        testBow.setSlot(Slot.WEAPON);
        testBow.setWeaponType(WeaponType.BOW);
        testBow.setDamage(12.);
        testBow.setAttackSpeed(0.8);

        testClothHead = new Armor();
        testClothHead.setName("Common Cloth Head Armor");
        testClothHead.setRequiredLevel(1);
        testClothHead.setSlot(Slot.HEAD);
        testClothHead.setArmorType(ArmorType.CLOTH);
        testClothHead.setBaseAttribute(new PrimaryAttribute(0.,0.,5.));

    }

    @Test
    public void equipWeapon_invalidLevel_InvalidItemExceptionShouldBeThrown() {
        try {
            testWeapon.setRequiredLevel(2);
            warrior.equipItem(testWeapon);
        }
        catch (InvalidItemException e){
            String expected_message = "Cannot equip item at current level!";
            assertEquals(expected_message,e.getMessage());
        }
    }
    @Test
    public void equipArmor_invalidLevel_InvalidItemExceptionShouldBeThrown() {
        try {
            testPlateBody.setRequiredLevel(2);
            warrior.equipItem(testPlateBody);
        }
        catch (InvalidItemException e){
            String expected_message = "Cannot equip item at current level!";
            assertEquals(expected_message,e.getMessage());
        }
    }
    @Test
    public void equipWeapon_invalidWeaponType_InvalidItemExceptionShouldBeThrown() {
        try {
            warrior.equipItem(testBow);
        }
        catch (InvalidItemException e){
            String expected_message = "Invalid item type " +
                    "for class " + warrior.getClass().getSimpleName();
            assertEquals(expected_message,e.getMessage());
        }
    }
    @Test
    public void equipArmor_invalidArmorType_InvalidItemExceptionShouldBeThrown() {
        try {
            warrior.equipItem(testClothHead);
        }
        catch (InvalidItemException e){
            String expected_message = "Invalid item type " +
                    "for class " + warrior.getClass().getSimpleName();
            assertEquals(expected_message,e.getMessage());
        }
    }

    @Test
    public void equipWeapon_validWeapon_returnTrue() throws InvalidItemException {
        warrior.equipItem(testWeapon);
        assert warrior.ValidItems.contains(testWeapon.getType());
        assert warrior.getLevel()>= testWeapon.getRequiredLevel();
    }
    @Test
    public void equipArmor_validArmor_returnTrue() throws InvalidItemException {
        warrior.equipItem(testPlateBody);
        assert warrior.ValidItems.contains(testPlateBody.getType());
        assert warrior.getLevel()>= testPlateBody.getRequiredLevel();
    }

    @Test
    public void calculateDPS_noWeaponEquipped_returnTrue(){
        Double expected_dps = 1.*(1.+ (5./100.) );
        Double actual_dps = warrior.DPS();
        assertEquals(expected_dps,actual_dps);
    }

    @Test
    public void calculateDPS_validWeaponEquipped_returnTrue() throws InvalidItemException{
        warrior.equipItem(testWeapon);
        Double expected_dps = testWeapon.getWeaponDPS()*(1.+ (5./100.) );
        Double actual_dps = warrior.DPS();
        assertEquals(expected_dps,actual_dps);
    }

    @Test
    public void calculateDPS_validWeaponAndArmorEquipped_returnTrue() throws InvalidItemException{
        warrior.equipItem(testWeapon);
        warrior.equipItem(testPlateBody);
        Double expected_dps = testWeapon.getWeaponDPS()*(1.+ ((5.+1.)/100.) );
        Double actual_dps = warrior.DPS();
        assertEquals(expected_dps,actual_dps);
    }


}