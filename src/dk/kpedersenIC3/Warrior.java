package dk.kpedersenIC3;

public class Warrior extends Character{

    public Warrior(String name){
        super(name);

        setBaseAttribute(new PrimaryAttribute(5.,2.,1.) );
    }

    @Override
    public void levelUp() {
        setLevel(getLevel()+1);
        setBaseAttribute(new PrimaryAttribute(
                getBaseAttribute().getStrength()+3.,
                getBaseAttribute().getDexterity()+2.,
                getBaseAttribute().getIntelligence()+1.));

    }

    @Override
    public Double DPS() {
        Double weapondps = 1.;
        Double multiplier = (1. + getTotalAttribute().getStrength()/100.);
        if(getEquipment().getEquipment().get(Slot.WEAPON) != null){
            weapondps = getEquipment().getEquipment().get(Slot.WEAPON).getWeaponDPS();
        }
        return weapondps*multiplier;
    }
}
