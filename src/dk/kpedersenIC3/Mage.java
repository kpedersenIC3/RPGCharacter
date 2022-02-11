package dk.kpedersenIC3;


import java.util.jar.Attributes;

public class Mage extends Character{
    public Mage(String name){
        super(name);
        setBaseAttribute(new PrimaryAttribute(1.,1.,8.) );

    }
    @Override
    public void levelUp() {
        setLevel(getLevel()+1);
        setBaseAttribute(new PrimaryAttribute(
                getBaseAttribute().getStrength()+1.,
                getBaseAttribute().getDexterity()+1.,
                getBaseAttribute().getIntelligence()+5.));

    }
}
