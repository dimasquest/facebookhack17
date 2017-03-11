package Items;

/**
 * Created by codiniosifpacuraru on 11/03/2017.
 */
public enum HealthRelated {
    Armor (100),
    Meds (20);

    private final int healthBoosters;

    HealthRelated(int healthBoosters) {
        this.healthBoosters = healthBoosters;
    }

    public int getHealthBoosters() {
        return healthBoosters;
    }
}
