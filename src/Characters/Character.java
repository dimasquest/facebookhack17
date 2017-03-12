package Characters;

import Items.Guns;
import Items.HealthRelated;
import Items.Miscellaneous;
import map.Square;

import java.util.List;

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

    public Character(String name, Jobs jobTitle, List<Attributes> attributes, List<Guns> guns,
                  List<HealthRelated> healthBoosters, List<Miscellaneous> miscellaneous, Square position)  {
        this.name = name;
        this.jobTitle = jobTitle;
        this.health = 100;
        this.gunInHand = Guns.KNIFE;
        this.attributes = attributes;
        this.guns = guns;
        this.healthBoosters = healthBoosters;
        this.miscellaneous = miscellaneous;
        this.position = position;
        this.isAlive = true;
        this.damage = gunInHand.getDamage();
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
    }

    public boolean isAlive() {
        return (health > 0);
    }
}
