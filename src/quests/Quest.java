package quests;

/**
 * Created by dimarammfire on 11.03.17.
 */
public abstract class Quest {
    public final String name;
    public final int expGained;
    public Type type;
    public final String description;
    public final boolean isCompleted;
    public final int decisionMade;

    public Quest(String name, int expGained, String description) {
        this.name = name;
        this.expGained = expGained;
        this.description = description;
        isCompleted = false;
        decisionMade = 0;
    }

    public void getDescription() {
        System.out.println(description);
    }

    public int getExpGained() {
        return expGained;
    }

    public Type getType() {
        return type;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

}
