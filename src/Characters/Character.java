package Characters;

import Items.Guns;
import Items.HealthRelated;
import Items.Miscellaneous;
import items.Armor;
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

    public Character(String name, Jobs jobTitle, List<Attributes> attributes, List<Guns> guns,
                  List<HealthRelated> healthBoosters, List<Miscellaneous> miscellaneous, Square position)  {
        this.name = name;
        this.jobTitle = jobTitle;
        this.health = 100;
        this.gunInHand = guns.get(0);
        this.attributes = attributes;
        this.guns = guns;
        this.healthBoosters = healthBoosters;
        this.miscellaneous = miscellaneous;
        this.position = position;
        this.isAlive = true;
        this.damage = gunInHand.getDamage();
        this.armor = Armor.LEATHER;
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


    public void improveStats() {
        System.out.println("You leveled up! Choose an attribute to improve.");
        System.out.println("Current: ");
        showAttributes();
        Scanner input = new Scanner(System.in);
        switch (input.toString()) {
            case "Intelligence": attributes.get(5).incrementAttribute(attributes.get(5)); break;
            case "Charisma": attributes.get(2).incrementAttribute(attributes.get(2)); break;
            case "Luck": attributes.get(3).incrementAttribute(attributes.get(3)); break;
            case "Strength": attributes.get(4).incrementAttribute(attributes.get(4)); break;
            default:
                System.out.println("Invalid value");
                input = new Scanner(System.in);
                break;
        }
        System.out.println("New attributes:");
        showAttributes();
        attributes.get(0).setAttributeValue(0);
    }

    public boolean isAlive() {
        return (health > 0);
    }

    public void showAttributes() {
        System.out.println("Your attributes are: Experience " + attributes.get(0).getAttributeValue() +", Reputation " + attributes.get(1).getAttributeValue() +
        ", Charisma " + attributes.get(2).getAttributeValue() + ", Luck " + attributes.get(3).getAttributeValue() + ", Strength " + attributes.get(4).getAttributeValue() +
        ", Intelligence " + attributes.get(5).getAttributeValue());
    }
}
