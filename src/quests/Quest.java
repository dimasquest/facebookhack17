package quests;

/**
 * Created by dimarammfire on 11.03.17.
 */
public abstract class Quest {
    public String name;
    public int expGained;
    public Type type;
    public Description description;

    public Quest(String name, int expGained, Description description) {
        this.name = name;
        this.expGained = expGained;
        this.description = description;
    }
}
