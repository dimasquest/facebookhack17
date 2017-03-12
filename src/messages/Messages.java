package messages;

import Characters.Character;
import game.Combat;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class Messages {

    public Character player;
    public Character enemy;

    public Messages() {
    }

    public void needHealing(Character player) {
        Scanner input = new Scanner(System.in);
        String in = input.next();
        if (player.getHealth() < 50) {
            System.out.println("You need meds! Do you want to spend 100 xp to heal?");
            if (in.equals("y")) {
                player.setHealth(110);
                player.getAttributes().get(0).pay(player.getAttributes().get(0));
            }
            System.out.println("Your health is " + player.getHealth());
        }
    }

    public void randomEncounters() throws IOException {
        int random = ThreadLocalRandom.current().nextInt(0, 3);
        Combat combat = new Combat(player, enemy);
        if (random == 0) {
            System.out.println("Ambush! Get ready for a fight!");
            enemy.setHealth(100);
            combat.attack();
        }
        else if (random == 1) {
            System.out.println("You found a relic! Extra exp.");
            player.getAttributes().get(0).addExp(200);
            player.showAttributes();
        }
        else {
            System.out.println("Nothing special happens...");
        }
    }
}
