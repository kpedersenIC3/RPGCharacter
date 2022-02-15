package dk.kpedersenIC3;
//Invalid Weapon and Armor exception are collected in
//InvalidItemException as both valid armor and weapon types
//are checked when equipping items.
public class InvalidItemException extends Exception{
    public InvalidItemException(String message){
        super(message);
    }
}
