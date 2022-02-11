package dk.kpedersenIC3;

public class Warrior extends Character{

    public Warrior(String name){
        super(name);
        setPrimaryAttributes(5.,2.,1.);
    }

    @Override
    public void levelUp() {
        setLevel(getLevel()+1);
        setPrimaryAttributes(
                getPrimaryAttributes().get("Strength")+3.,
                getPrimaryAttributes().get("Dexterity")+2.,
                getPrimaryAttributes().get("Intelligence")+1.
        );
    }
}
