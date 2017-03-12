package quests;

/**
 * Created by dimarammfire on 11.03.17.
 */

public class SecondaryQuest extends Quest {

    public SecondaryQuest(String name, int expGained, String description) {
        super(name, expGained, description);
        super.type = Type.SECONDARY;
        System.out.println(name + "\n\n" + description + " Reward: " +
            expGained);
    }
}