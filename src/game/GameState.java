package game;

import Characters.Character;
import Items.HealthRelated;
import map.Square;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class GameState {

    public Character player;

    public GameState(Character player) {
        this.player = player;
    }

    public void levelUp(int newExp) {
        if (player.getE().getAttributeValue() + newExp > 1200) {
            System.out.println("Level up!");
            player.improveStats();
            player.getE().setAttributeValue(player.getE().getAttributeValue() + newExp - 1200);
            player.incLevel();
        }
        else {
            player.getE().setAttributeValue(player.getE().getAttributeValue() + newExp);
        }
    }

    public void heal() {
        player.getHealthBoosters().remove(HealthRelated.Stimpack);
        player.addHealth(20);
    }
}
