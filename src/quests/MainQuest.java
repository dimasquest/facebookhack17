package quests;

/**
 * Created by dimarammfire on 11.03.17.
 */

public class MainQuest extends Quest {


    public MainQuest(String name, int expGained, String description) {
        super(name, expGained, description);
        super.type = Type.MAIN;
        System.out.println(name + "\n\n" + description + " Reward: " +
            expGained);
    }
}
