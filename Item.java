
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public class Item implements ItemInterface{
    //Implemented in your own way
    private ArrayList stats;
    String name;
    public Item(String name){
        this.name = name;
        stats = new ArrayList();
    }
    public ArrayList getStats(){
        return stats;
    }
    public String getName(){
        return name;
    }
    
}
