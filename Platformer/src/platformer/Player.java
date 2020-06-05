
package platformer;

/**
 *
 * @author jorda
 */
public class Player {
    private int hp = 10;
    private int atk = 1;
    
    
    public Player(int hp, int atk){
        this.hp = hp;
        this.atk = atk;
    }
    
    
    
    
    
    public void setHp(int newHp){
        this.hp = newHp;
    }
    public void setAtk(int newAtk){
        this.atk = newAtk;
    }
    
    
    
    
    
    public int getHp(){
        return this.hp;
    }
    public int getAtk(){
        return this.atk;
    }
    
}
