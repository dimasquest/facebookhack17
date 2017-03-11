package quests;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class SecondaryQuest extends Quest {

    public SecondaryQuest observer = new SecondaryQuest("Observer", 100, "Walk around and check if anyone needs help.");

    public SecondaryQuest(String name, int expGained, String description) {
        super(name, expGained, description);
        this.type = Type.SECONDARY;
        this.isCompleted = false;
    }

}
