package Items;

/**
 * Created by dimarammfire on 12.03.17.
 */
public enum Armor {
    LEATHER(0.05, "leather", 0),
    LIGHT_METAL(0.1, "light metal", 2),
    HEAVY_METAL(0.3, "heavy metal", 5),
    SCRAP(0.03, "scrap", 0),
    COMBAT_LIGHT(0.15, "light combat", 3),
    COMBAT_HEAVY(0.4, "heavy combat", 6),
    RANGER_ARMOR(0.6, "ranger combats", 7),
    EXOSKELETON(0.8, "exoskeleton", 0);


    private final double defenseRating;
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
}
