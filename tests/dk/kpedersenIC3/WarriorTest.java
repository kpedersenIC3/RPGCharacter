package dk.kpedersenIC3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    Warrior warrior;
    @BeforeEach
    void setUp() {
        warrior = new Warrior("test_name");
    }
    @Test
    public void constructor_validInput_shouldCreateLevel1(){
        int actual_initial_level = warrior.getLevel();
        int expected_initial_level = 1;
        assertEquals(expected_initial_level, actual_initial_level);
    }

    @Test
    public void levelGain_validInput_shouldLevelUptoLevel2(){
        warrior.levelUp();
        int actual_level = warrior.getLevel();
        int expected_level = 2;
        assertEquals(expected_level, actual_level);
    }

    @Test
    public void baseStrength_validInput_shouldBe5(){
        Double actual_strength = warrior.getBaseAttribute().getStrength();
        Double expected_strength = 5.;
        assertEquals(expected_strength, actual_strength);
    }
    @Test
    public void baseIntelligence_validInput_shouldBe1(){
        Double actual_intelligence = warrior.getBaseAttribute().getIntelligence();
        Double expected_intelligence = 1.;
        assertEquals(expected_intelligence, actual_intelligence);
    }
    @Test
    public void baseDexterity_validInput_shouldBe2(){
        Double actual_dexterity = warrior.getBaseAttribute().getDexterity();
        Double expected_dexterity = 2.;
        assertEquals(expected_dexterity, actual_dexterity);
    }
    @Test
    public void levelUpStrength_validInput_shouldBe8(){
        warrior.levelUp();
        Double actual_strength = warrior.getBaseAttribute().getStrength();
        Double expected_strength = 8.;
        assertEquals(expected_strength, actual_strength);
    }
    @Test
    public void levelUpIntelligence_validInput_shouldBe2(){
        warrior.levelUp();
        Double actual_intelligence = warrior.getBaseAttribute().getIntelligence();
        Double expected_intelligence = 2.;
        assertEquals(expected_intelligence, actual_intelligence);
    }
    @Test
    public void levelUpDexterity_validInput_shouldBe4(){
        warrior.levelUp();
        Double actual_dexterity = warrior.getBaseAttribute().getDexterity();
        Double expected_dexterity = 4.;
        assertEquals(expected_dexterity, actual_dexterity);
    }
}