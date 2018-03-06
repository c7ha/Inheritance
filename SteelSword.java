
/**
 * Write a description of class SteelSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SteelSword extends Sword
{
    int damage;
    boolean parry;
    public SteelSword(int damage){
        this.damage = damage;
        parry = false;
    }
    public boolean parry(){
        return parry;
    }
    public int attack(int damage){
        int attack = this.damage;
        return attack;
    }
    
}
