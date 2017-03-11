package game;

import Characters.Character;
import map.Square;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class GameState {

    public Square location;
    public int hp;
    public int exp;
    public int decisionFinalCounter;
    public Character player;

    public GameState(Square location, int hp, int exp) {
        this.location = location;
        this.hp = hp;
        this.exp = exp;
    }

    public void levelUp(int newExp) {
        if (exp + newExp > 1200) {
//            GameState.improveStats();
        }
        else {
            exp +=newExp;
        }
    }

    public void improveStats(){

    }
}
