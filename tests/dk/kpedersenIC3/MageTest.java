package dk.kpedersenIC3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Test class to test if character class Mage initializes and levels up as intended.
//Tests done is implicit in  test method name.
class MageTest {
    Mage mage;
    @BeforeEach
    void setUp() {
        mage = new Mage("test_name");
    }

    @Test
    public void constructor_validInput_shouldCreateLevel1(){
        int actual_initial_level = mage.getLevel();
        int expected_initial_level = 1;
        assertEquals(expected_initial_level, actual_initial_level);
    }

    @Test
    public void levelGain_validInput_shouldLevelUptoLevel2(){
        mage.levelUp();
        int actual_level = mage.getLevel();
        int expected_level = 2;
        assertEquals(expected_level, actual_level);
    }

    @Test
    public void baseStrength_validInput_shouldBe1(){
        Double actual_strength = mage.getBaseAttribute().getStrength();
        Double expected_strength = 1.;
        assertEquals(expected_strength, actual_strength);
    }
    @Test
    public void baseIntelligence_validInput_shouldBe8(){
        Double actual_intelligence = mage.getBaseAttribute().getIntelligence();
        Double expected_intelligence = 8.;
        assertEquals(expected_intelligence, actual_intelligence);
    }
    @Test
    public void baseDexterity_validInput_shouldBe1(){
        Double actual_dexterity = mage.getBaseAttribute().getDexterity();
        Double expected_dexterity = 1.;
        assertEquals(expected_dexterity, actual_dexterity);
    }
    @Test
    public void levelUpStrength_validInput_shouldBe2(){
        mage.levelUp();
        Double actual_strength = mage.getBaseAttribute().getStrength();
        Double expected_strength = 2.;
        assertEquals(expected_strength, actual_strength);
    }
    @Test
    public void levelUpIntelligence_validInput_shouldBe13(){
        mage.levelUp();
        Double actual_intelligence = mage.getBaseAttribute().getIntelligence();
        Double expected_intelligence = 13.;
        assertEquals(expected_intelligence, actual_intelligence);
    }
    @Test
    public void levelUpDexterity_validInput_shouldBe2(){
        mage.levelUp();
        Double actual_dexterity = mage.getBaseAttribute().getDexterity();
        Double expected_dexterity = 2.;
        assertEquals(expected_dexterity, actual_dexterity);
    }

}