
/**
 * Write a description of class IronArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IronArmor extends WearableItem{
    int defense;
    boolean blocked;
    String name;
    public IronArmor(int defense, String name){
        this.defense = defense;
    }
    public boolean blocked(){
        return blocked;
    }
}
