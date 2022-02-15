package dk.kpedersenIC3;

import java.util.HashMap;
//Equipment type class. HashMap with <String, Item> is  used to only
//occupy one slot at the time.
public class Equipment {
    private HashMap<String, Item> Equipment;

    public Equipment(){
        Equipment = new HashMap<>();
    }

    public HashMap<String, Item> getEquipment() {
        return Equipment;
    }

}
