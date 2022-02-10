package dk.kpedersenIC3;

public abstract class Item {
    private String Name;
    private Integer RequiredLevel;
    private String Slot;

    public Item(String Name, Integer RequiredLevel, String Slot){
        this.Name = Name;
        this.RequiredLevel = RequiredLevel;
        this.Slot = Slot;
    }
}
