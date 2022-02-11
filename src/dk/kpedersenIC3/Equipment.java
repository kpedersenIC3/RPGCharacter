package dk.kpedersenIC3;

import java.util.HashMap;

public class Equipment {
    private HashMap<String, Item> Equipment;

    public Equipment(){
        Equipment = new HashMap<>();
    }

    public HashMap<String, Item> getEquipment() {
        return Equipment;
    }

    public void setEquipment(HashMap<String, Item> equipment) {
        Equipment = equipment;
    }
}
