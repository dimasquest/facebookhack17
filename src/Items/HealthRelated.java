package Items;

/**
 * Created by codiniosifpacuraru on 11/03/2017.
 */
public enum HealthRelated {
    Stimpack (20),
    Superstimpack(50),
    DamProtector(20);

    private final int healthBoosters;

    HealthRelated(int healthBoosters) {
        this.healthBoosters = healthBoosters;
    }

    public int getHealthBoosters() {
        return healthBoosters;
    }
}
