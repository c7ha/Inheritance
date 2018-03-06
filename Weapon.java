
/**
 * Abstract class Weapon - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
import java.util.ArrayList;
public abstract class Weapon extends Item implements WeaponInterface{
    String name;
    int damage;
    boolean parry;
    public Weapon(String name, int damage, boolean parry){
        this.name = name;
        this.damage = damage;
    }
    public int attack(){
        int attack = this.damage;
        return attack;
    }
    public boolean parry(){
        return parry;
    }
}
