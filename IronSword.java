
/**
 * Write a description of class IronSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IronSword extends Sword
{
    int damage;
    boolean parry;
    public IronSword(int damage){
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
