
package platformer;

import java.util.ArrayList;

/**
 *
 * @author jorda
 */
public class Enemy {
    private final String name;
    private int hp;
    private int atk;
    //private final double chance;
    
    public Enemy(String name, int hp, int atk/*, double chance*/){
        this.name = name;
        this.hp = hp;
        this.atk = atk;
        //this.chance = chance;
    }
    
    public static ArrayList<Enemy> enemyInit() {
                                 //name,   hp,  atk
        Enemy rat =     new Enemy("Rat",    1,  0/*, .80*/);
        Enemy goblin =  new Enemy("Goblin", 1,  1);
        
        
        ArrayList<Enemy> enemyList = new ArrayList<Enemy>(); //List of all enemies in game
        
        enemyList.add(rat);
        enemyList.add(goblin);
        
        return enemyList;
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
    public String getName(){
        return this.name;
    }
    
}