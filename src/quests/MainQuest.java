package quests;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class MainQuest extends Quest {


    public MainQuest(String name, int expGained, String description) {
        super(name, expGained, description);
        this.type = Type.MAIN;
        this.decisionMade = 0;
        System.out.println(name + "\n\n" + description + " Reward: " +
            expGained);
    }

    public void getDescription() {
        System.out.println(description);
    }

//    public void buildMainQuestLine() {
//        listOfMainQuests.add(defendTheGate);
//        listOfMainQuests.add(findWhoTheGuestIs);
//        listOfMainQuests.add(findTheTraintor);
//        listOfMainQuests.add(defendTheTown);
//        listOfMainQuests.add(clearTheRuins);
//        listOfMainQuests.add(findTheBase);
//        listOfMainQuests.add(defeatOnceAndForAll);
//    }
}
