
/**
 * Abstract class Consumable - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
import java.util.ArrayList;
public abstract class Consumable  extends Item{
    boolean used;
    ArrayList Stats;
    public Consumable(){
        boolean used = false;
        ArrayList Stats = ()
    }
    public void Drink(){
        if (used == false){
            System.out.println("You drink the potion");
            boolean used = true;
            Backpack.remove(Item);
        }
        else{
            System.out.println("This bottle is used");
        }
        
    }
}
