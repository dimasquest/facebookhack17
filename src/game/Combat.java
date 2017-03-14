package game;

import Characters.Character;
import Items.HealthRelated;
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

    public void combatActions(Character player, Character enemy) {
        Scanner user_input = new Scanner(System.in);
        boolean flag = false;
            switch (user_input.nextInt()) {
                case 1:
                    player.setDamage(10);
                    System.out.println("You attack");
                    break;
                case 2:
                    System.out.println("Stimpack or Superstimpack? 9/0");
                    Scanner med = new Scanner(System.in);
                    if (med.nextInt() == 9) {
                        try {
                        player.getHealthBoosters().remove(HealthRelated.Stimpack);
                            player.addHealth(20);
                        }
                        catch (NullPointerException n){
                            System.out.println("No stimpacks");
                        }
                        System.out.println("You used a stimpack and have " +player.getHealthBoosters().size() + " left.");
                        System.out.println("Your health is : " + player.getHealth());
                    } else {
                        player.getHealthBoosters().remove(HealthRelated.Superstimpack);
                        player.addHealth(50);
                    }
                    break;
                case 3:
                    player.getArmor().setDefenseRating(0.1);
                    System.out.println("You defend");
                    break;
                default:
                    break;
            }
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
        int random;
        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("You are fighting " + enemy.getName());
            int yourDamage;
            if (enemy.getAttributes().get(1).getAttributeValue() >= enemy.getArmor().getStrengthRating()) {
                yourDamage = (int) (player.getGunInHand().getDamage() * (1 - enemy.getArmor().getDefenseRating()));
            } else {
                yourDamage = player.getGunInHand().getDamage();
            }
            enemy.setHealth(enemy.getHealth() - yourDamage);
            System.out.println("Your attack was " + yourDamage+ " and " + "the enemy has " + enemy.getHealth() +
                    " hp remaining.");
            random = ThreadLocalRandom.current().nextInt(4,11);
            int hisDamage;
            if (player.getAttributes().get(2).getAttributeValue() > random) {
                System.out.println("Lucky! No damage");
                hisDamage = 0;
            }
            else {
                if (player.getAttributes().get(4).getAttributeValue() >= player.getArmor().getStrengthRating()) {
                    hisDamage = (int) (enemy.getGunInHand().getDamage() * (1 - player.getArmor().getDefenseRating()));
                } else {
                    hisDamage = enemy.getGunInHand().getDamage();
                }
                player.setHealth(player.getHealth() - hisDamage);
                System.out.println(enemy.getName() + " caused you " + hisDamage + " damage." +
                        " You have " + player.getHealth()+ " hp remaining.");
            }
            if (enemy.isAlive()) {
                System.out.println("Press enter next action: 1 for attack, 2 for healing, 3 for defense");
                combatActions(player, enemy);
            }

        }
        if (player.isAlive()) {
            System.out.println("You won the battle!");
            if (enemy.getName().equals("Ajax") || enemy.getName().equals("Jet") ||
                    enemy.getName().equals("Scrum") || enemy.getName().equals("Astra") ||
                    enemy.getName().equals("Biggy") || enemy.getName().equals("Scrum")) {
                player.getAttributes().get(3).setAttributeValue(player.getE().getAttributeValue()+450);
                System.out.println("You earned 450 xp. Your current xp is " + player.getAttributes().get(3).getAttributeValue());
            }
            player.getAttributes().get(3).setAttributeValue(player.getE().getAttributeValue()+150);
            System.out.println("You earned 150 xp. Your current xp is " + player.getAttributes().get(3).getAttributeValue());
        }
        else {
            System.out.println("You lost. What a shame.");
        }


    }
}
