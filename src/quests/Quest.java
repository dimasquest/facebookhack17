package quests;

/**
 * Created by dimarammfire on 11.03.17.
 */
public abstract class Quest {
    public String name;
    public int expGained;
    public Type type;
    public String description;
    public boolean isCompleted;
    public int decisionMade;

    public Quest(String name, int expGained, String description) {
        this.name = name;
        this.expGained = expGained;
        this.description = description;
        isCompleted = false;
        decisionMade = 0;
    }
}
