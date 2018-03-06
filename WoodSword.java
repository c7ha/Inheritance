
/**
 * Write a description of class WoodSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class WoodSword extends Sword{
    int damage;
    boolean parry;
    public WoodSword(){
        int damage = 10;
        boolean parry = false;
    }
    public boolean parry(){
        return parry;
    }
    public int attack(int damage){
        int attack = damage;
        return attack;
    }
    public void swing(){
        System.out.println("You take a shot at the enemy");
    }
    
}
