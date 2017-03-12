package quests;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class MainQuest extends Quest {

    public List<MainQuest> listOfMainQuests= new ArrayList();

    public MainQuest defendTheGate = new MainQuest("To the gates!", 500,
            "Enemies are storming into the city, protect it!");
    public MainQuest findWhoTheGuestIs = new MainQuest("Who is this guy?", 750,
            "Find a way to identify the stranger.");
    public MainQuest findTheTraintor = new MainQuest("Identify the traitor", 1000,
            "There is definitely a traitor amongst us. Find out who that is.");
    public MainQuest defendTheTown = new MainQuest("Protect the town", 1500,
            "The town is on fire! Protect it!");
    public MainQuest clearTheRuins = new MainQuest("Clear the ruins", 2000,
            "Defeat the raiders in the ruins. That is their base.");
    public MainQuest findTheBase = new MainQuest("Find raider HQ", 1000,
            "Find the main base is.");
    public MainQuest defeatOnceAndForAll = new MainQuest("Something ends, something begins", 3000,
            "Defeat the raiders in the last battle for the Wasteland!");


    public MainQuest(String name, int expGained, String description) {
        super(name, expGained, description);
        this.type = Type.MAIN;
        this.decisionMade = 0;
        System.out.println(name + "\n\n" + description + "Reward: " + expGained);
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
