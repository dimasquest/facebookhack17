package game;

import Characters.Character;
import messages.RaiderStories;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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

    public void setEnemy(Character enemy) {
        this.enemy = enemy;
    }

    public void attack() throws IOException {
        Scanner user_input = new Scanner(System.in);
        RaiderStories story = new RaiderStories();
        story.getStory(enemy.getName());
        System.in.read();
        System.out.println("Fight is about to begin with :" + enemy.getName());
        System.in.read();
        int random = ThreadLocalRandom.current().nextInt(4,11);
        while (player.isAlive() && enemy.isAlive()) {
            if (player.getAttributes().get(3).getAttributeValue() > random) {
                System.out.println("Lucky! No damage");
            }
            else {
                player.setHealth(player.getHealth() - enemy.getGunInHand().getDamage());
            }
            enemy.setHealth(enemy.getHealth() - player.getGunInHand().getDamage());
            random = ThreadLocalRandom.current().nextInt(4,11);
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
            if (enemy.getName().equals("Ajax") || enemy.getName().equals("Jet") ||
                    enemy.getName().equals("Scrum") || enemy.getName().equals("Astra") ||
                    enemy.getName().equals("Biggy") || enemy.getName().equals("Scrum")) {
                player.getAttributes().get(0).incrementExpBoss(player.getAttributes().get(0));
                System.out.println("You earned 350 xp. Your current xp is " + player.getAttributes().get(0).getAttributeValue());
            }
            player.getAttributes().get(0).incrementExpNormal(player.getAttributes().get(0));
            System.out.println("You earned 150 xp. Your current xp is " + player.getAttributes().get(0).getAttributeValue());
        }
        else {
            System.out.println("You lost. What a cunt.");
        }


    }
}
