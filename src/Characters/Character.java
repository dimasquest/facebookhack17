package Characters;

import Items.*;
import map.Square;

import java.util.List;
import java.util.Scanner;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class Character {

    private final String name;
    private final Jobs jobTitle;
    private int health;
    private Guns gunInHand;
    private final List<Attributes> attributes;
    private final List<Guns> guns;
    private final List<HealthRelated> healthBoosters;
    private final List<Miscellaneous> miscellaneous;
    private Square position;
    private boolean isAlive;
    private int damage;
    private Armor armor;
    private int level;

    public Character(String name, Jobs jobTitle, List<Attributes> attributes, List<Guns> guns,
                  List<HealthRelated> healthBoosters, List<Miscellaneous> miscellaneous, Square position)  {
        this.name = name;
        this.jobTitle = jobTitle;
        this.health = 120;
        this.gunInHand = guns.get(0);
        this.attributes = attributes;
        this.guns = guns;
        this.healthBoosters = healthBoosters;
        this.healthBoosters.add(HealthRelated.Stimpack);
        this.healthBoosters.add(HealthRelated.Stimpack);
        this.healthBoosters.add(HealthRelated.Stimpack);
        this.healthBoosters.add(HealthRelated.Superstimpack);
        this.miscellaneous = miscellaneous;
        this.position = position;
        this.isAlive = true;
        this.damage = gunInHand.getDamage();
        this.armor = Armor.LEATHER;
        this.level = 0;
    }

    public String getName() {
        return name;
    }

    public Jobs getJobTitle()
    {
        return jobTitle;
    }

    public int getHealth() {
        return health;
    }

    public Guns getGunInHand() {
        return gunInHand;
    }

    public List<Attributes> getAttributes() {
        return attributes;
    }

    public List<Guns> getGuns() {
        return guns;
    }

    public List<HealthRelated> getHealthBoosters() {
        return healthBoosters;
    }

    public List<Miscellaneous> getMiscellaneous()

    {
        return miscellaneous;
    }

    public Square getPosition() {
        return position;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setGunInHand(Guns gunInHand)
    {
        this.gunInHand = gunInHand;
    }

    public void setPosition(Square position) {
        this.position = position;
    }

    public Attributes getS() {return attributes.get(0);}

    public Attributes getI() {return attributes.get(1);}

    public Attributes getL() {return attributes.get(2);}

    public Attributes getE() {return attributes.get(3);}

    public Attributes getC() {return attributes.get(4);}

    public Attributes getR() {return attributes.get(5);}

    public void improveStats() {
        System.out.println("You leveled up! Choose an attribute to improve.");
        System.out.println("Current: ");
        attributes.get(1).incrementAttribute(attributes.get(1));
        attributes.get(2).incrementAttribute(attributes.get(2));
        attributes.get(3).incrementAttribute(attributes.get(3));
        attributes.get(0).incrementAttribute(attributes.get(0));
        attributes.get(5).incrementAttribute(attributes.get(5));
        level++;
        setHealth(120+10*level);
        showAttributes();
        }

    public boolean isAlive() {
        return (health > 0);
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void showAttributes() {
        System.out.println("Your attributes are: Experience " + attributes.get(3).getAttributeValue() +", Reputation " + attributes.get(5).getAttributeValue() +
        ", Charisma " + attributes.get(4).getAttributeValue() + ", Luck " + attributes.get(2).getAttributeValue() + ", Strength " + attributes.get(0).getAttributeValue() +
        ", Intelligence " + attributes.get(1).getAttributeValue());
    }

    public void incLevel() {
        this.level = level + 1;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setDamage(int ext) {
        this.damage += ext;
    }

    public void addHealth(int add) {
        this.health += add;
    }
}