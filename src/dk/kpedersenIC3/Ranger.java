package dk.kpedersenIC3;

public class Ranger extends Character{

    public Ranger(String name){
        super(name);

        setBaseAttribute(new PrimaryAttribute(1.,7.,1.) );
    }

    @Override
    public void levelUp() {
        setLevel(getLevel()+1);
        setBaseAttribute(new PrimaryAttribute(
                getBaseAttribute().getStrength()+1.,
                getBaseAttribute().getDexterity()+5.,
                getBaseAttribute().getIntelligence()+1.));

    }

    @Override
    public Double DPS() {
        Double weapondps = 1.;
        Double multiplier = (1. + getTotalAttribute().getDexterity()/100.);
        if(getEquipment().getEquipment().get(Slot.WEAPON) != null){
            weapondps = getEquipment().getEquipment().get(Slot.WEAPON).getWeaponDPS();
        }
        return weapondps*multiplier;
    }

}
