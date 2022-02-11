package dk.kpedersenIC3;

public class Rogue extends Character{
    public Rogue(String name){
        super(name);

        setBaseAttribute(new PrimaryAttribute(2.,6.,1.) );
    }

    @Override
    public void levelUp() {
        setLevel(getLevel()+1);
        setBaseAttribute(new PrimaryAttribute(
                getBaseAttribute().getStrength()+1.,
                getBaseAttribute().getDexterity()+4.,
                getBaseAttribute().getIntelligence()+1.));

    }

}
