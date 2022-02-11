package dk.kpedersenIC3;


import java.util.jar.Attributes;

public class Mage extends Character{
    public Mage(String name){
        super(name);
        setPrimaryAttributes(1.,1.,8.);
    }
    @Override
    public void levelUp() {
        setLevel(getLevel()+1);
        setPrimaryAttributes(
                getPrimaryAttributes().get("Strength")+1.,
                getPrimaryAttributes().get("Dexterity")+1.,
                getPrimaryAttributes().get("Intelligence")+5.
        );
    }
}
