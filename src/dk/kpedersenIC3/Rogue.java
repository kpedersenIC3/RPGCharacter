package dk.kpedersenIC3;

public class Rogue extends Character{
    public Rogue(String name){
        super(name);
        setPrimaryAttributes(2.,6.,1.);
    }

    @Override
    public void levelUp() {
        setLevel(getLevel()+1);
        setPrimaryAttributes(
                getPrimaryAttributes().get("Strength")+1.,
                getPrimaryAttributes().get("Dexterity")+4.,
                getPrimaryAttributes().get("Intelligence")+1.
        );
    }

}
