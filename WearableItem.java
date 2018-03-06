
/**
 * Abstract class WearableItem - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class WearableItem extends Item implements DefenseCommands{
    int defense;
    boolean blocked;
    String name;
    public WearableItem(int defense,String name){
        this.defense = defense;
        this.name = name;
    }
    public void putOn(){
        
        System.out.println("You put on the armor");
        defense = protection + defense;
    }
    
}
