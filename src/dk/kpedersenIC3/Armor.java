package dk.kpedersenIC3;

public class Armor extends Item{
    public Armor(){
        super();
    }
    //Override the toString() method for a sweet looking stats printout.
    @Override
    public  String toString() {
            return "\nSlot: " + getSlot() +
                    "\nType: " + getArmorType() +
                    "\nName: " + getName() +
                    "\nRequired Level: " + getRequiredLevel() +
                    "\n***Abilities***" +
                    "\nStrength: " + getBaseAttribute().getStrength() +
                    "\nDexterity: " + getBaseAttribute().getDexterity() +
                    "\nIntelligence:" + getBaseAttribute().getIntelligence();

    }
}
