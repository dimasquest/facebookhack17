package Items;

/**
 * Created by dimarammfire on 12.03.17.
 */
public enum Armor {
    LEATHER(0.1, "leather", 0),
    LIGHT_METAL(0.2, "light metal", 2),
    HEAVY_METAL(0.35, "heavy metal", 5),
    SCRAP(0.03, "scrap", 0),
    COMBAT_LIGHT(0.15, "light combat", 3),
    COMBAT_HEAVY(0.4, "heavy combat", 6),
    RANGER_ARMOR(0.6, "ranger combats", 7),
    SKIN(0.3,"animal skin",0),
    EXOSKELETON(0.8, "exoskeleton", 0);


    private double defenseRating;
    private final String name;
    private final int strengthRating;

    Armor(double defenseRating, String name, int strengthRating) {
        this.defenseRating = defenseRating;
        this.name = name;
        this.strengthRating = strengthRating;
    }

    public double getDefenseRating() {
        return defenseRating;
    }

    public String getName() {
        return name;
    }

    public int getStrengthRating() {
        return strengthRating;
    }

    public void setDefenseRating(double def) {
        this.defenseRating = defenseRating+def;
    }
}
