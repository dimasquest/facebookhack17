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
//    public Items.Guns gunEquipped;
//    public Items.HealthRelated armor;
    public int decisionFinalCounter;
    public Character player;

    public void levelUp(int newExp) {
        if (exp + newExp > 1200) {
//            player.improveStats();
        }
        else {
            exp +=newExp;
        }
    }

    public void improveStats(){}
}
