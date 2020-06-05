
package platformer;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author jorda
 */
public class Game {
 
    ArrayList<Enemy> myEnemyList = Enemy.enemyInit();
    
    Player p = new Player(10, 10);
    
    public Player getPlayer(){
        return p;
    }
    

    
    public void shuffleEnemies(ArrayList<Enemy> e){
        Collections.shuffle(e);
    }
    
    
    public ArrayList<Enemy> getEnemyList(){
        return this.myEnemyList;
    }
    
    public Enemy getEnemy(){
        return myEnemyList.remove(0); //pop enemy on top of stack   
    }
}
