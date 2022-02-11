package dk.kpedersenIC3;

public class Ranger extends Character{

    public Ranger(String name){
        super(name);
        setPrimaryAttributes(1.,7.,1.);
    }

    @Override
    public void levelUp() {
        setLevel(getLevel()+1);
        setPrimaryAttributes(
                getPrimaryAttributes().get("Strength")+1.,
                getPrimaryAttributes().get("Dexterity")+5.,
                getPrimaryAttributes().get("Intelligence")+1.
        );
    }


}
