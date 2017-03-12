package Items;

/**
 * Created by codiniosifpacuraru on 11/03/2017.
 */
public enum Guns {
    NONE (0,0, "no gun"),
    REVOLVER (20, 0.03, "revolver"),
    KNIFE (10, 0, "knife"),
    SHOTGUN (50, 0.1, "shotgun"),
    LIGHT_PISTOL(15, 0.05, "light pistol"),
    M4(22, 0.05, "m4"),
    M1(45, 0.2,"m1"),
    HECATE(130, 0.3, "Hecate II"),
    AXE(55, 0, "fireaxe"),
    HEAVY_PISTOL(20, 0.1,"heavy pistol"),
    BIG_IRON(40, 0.02, "big iron");

    private final int damage;
    private final double chanceToBrake;
    private final String name;

    Guns(int damage, double chanceToBrake, String name) {
        this.damage = damage;
        this.chanceToBrake = chanceToBrake;
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public double getChanceToBrake()
    {
        return chanceToBrake;
    }

    public String getName() {
        return name;
    }
}
