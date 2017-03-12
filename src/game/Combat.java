package game;

import Characters.Character;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class Combat {

    Character player;
    Character enemy;

    public Combat(Character player, Character enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void attack() throws IOException {
        Scanner user_input = new Scanner(System.in);
        while (player.isAlive() && enemy.isAlive()) {
            player.setHealth(player.getHealth() - enemy.getGunInHand().getDamage());
            enemy.setHealth(enemy.getHealth() - player.getGunInHand().getDamage());
            System.out.println("You are fighting " + enemy.getName());
            System.out.println("Your attack was " + player.getGunInHand().getDamage()+ " and " +
                    "the enemy has " + enemy.getHealth()+ " hp remaining.");
            System.out.println(enemy.getName() + " caused you " + enemy.getGunInHand().getDamage() + " damage." +
                    " You have " + player.getHealth()+ " hp remaining.");
            System.out.println("Press enter to keep fighting:");
            System.in.read();
        }
        if (player.isAlive()) {
            System.out.println("You won the battle!");
        }
        else {
            System.out.println("You lost. What a cunt.");
        }
    }
}
