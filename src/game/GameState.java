package game;

import Characters.Character;
import map.Square;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class GameState {

    public int exp;
    public int decisionFinalCounter;
    public Character player;

    public GameState() {
    }

    public void levelUp(int newExp) {
        if (exp + newExp > 1200) {
            player.improveStats();
            exp = exp + newExp - 1200;
        }
        else {
            exp +=newExp;
        }
    }
}
