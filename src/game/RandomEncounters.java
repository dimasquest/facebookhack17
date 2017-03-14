package game;

import Characters.Character;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by dimarammfire on 14.03.17.
 */
public class RandomEncounters {

    private Character player;
    private Character enemy;
    private Combat combat;

    public RandomEncounters(Character player, Character enemy) {
        this.player = player;
        this.enemy = enemy;
        this.combat = new Combat(player, enemy);
    }

    public void randomEncounters() throws IOException {
        int random = ThreadLocalRandom.current().nextInt(0, 10);
        switch (random) {
            case 1 :
                System.out.println("Ambushed by a raider!");
                combat.setEnemy(enemy);
                combat.attack();
                break;
            case 2 :
                System.out.println("Attacked by the nuke-dogs!");
                combat.setEnemy(enemy);
                combat.attack();
                break;
            case 3 : break;
            case 4 : break;
            case 5 : break;
            case 6 : break;
            case 7 : break;
            case 8 : break;
            case 9 : break;
            default : break;
        }
    }
}
