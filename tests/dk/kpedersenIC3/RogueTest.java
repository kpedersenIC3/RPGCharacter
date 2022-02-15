package dk.kpedersenIC3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//Test class to test if character class Rogue initializes and levels up as intended.
//Tests done is implicit in  test method name.
class RogueTest {
    Rogue rogue;
    @BeforeEach
    void setUp() {
        rogue = new Rogue("test_name");
    }

    @Test
    public void constructor_validInput_shouldCreateLevel1(){
        int actual_initial_level = rogue.getLevel();
        int expected_initial_level = 1;
        assertEquals(expected_initial_level, actual_initial_level);
    }

    @Test
    public void levelGain_validInput_shouldLevelUptoLevel2(){
        rogue.levelUp();
        int actual_level = rogue.getLevel();
        int expected_level = 2;
        assertEquals(expected_level, actual_level);
    }

    @Test
    public void baseStrength_validInput_shouldBe2(){
        Double actual_strength = rogue.getBaseAttribute().getStrength();
        Double expected_strength = 2.;
        assertEquals(expected_strength, actual_strength);
    }
    @Test
    public void baseIntelligence_validInput_shouldBe1(){
        Double actual_intelligence = rogue.getBaseAttribute().getIntelligence();
        Double expected_intelligence = 1.;
        assertEquals(expected_intelligence, actual_intelligence);
    }
    @Test
    public void baseDexterity_validInput_shouldBe6(){
        Double actual_dexterity = rogue.getBaseAttribute().getDexterity();
        Double expected_dexterity = 6.;
        assertEquals(expected_dexterity, actual_dexterity);
    }
    @Test
    public void levelUpStrength_validInput_shouldBe3(){
        rogue.levelUp();
        Double actual_strength = rogue.getBaseAttribute().getStrength();
        Double expected_strength = 3.;
        assertEquals(expected_strength, actual_strength);
    }
    @Test
    public void levelUpIntelligence_validInput_shouldBe2(){
        rogue.levelUp();
        Double actual_intelligence = rogue.getBaseAttribute().getIntelligence();
        Double expected_intelligence = 2.;
        assertEquals(expected_intelligence, actual_intelligence);
    }
    @Test
    public void levelUpDexterity_validInput_shouldBe10(){
        rogue.levelUp();
        Double actual_dexterity = rogue.getBaseAttribute().getDexterity();
        Double expected_dexterity = 10.;
        assertEquals(expected_dexterity, actual_dexterity);
    }
}