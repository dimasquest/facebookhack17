package quests;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class SecondaryQuest extends Quest {

    public List<SecondaryQuest> listofSecQuests = new ArrayList<>();

    public SecondaryQuest observer = new SecondaryQuest("Observer", 100,
            "Walk around and check if anyone needs help.");
    public SecondaryQuest dealWithWoundedRaider = new SecondaryQuest("Deal with the wounded raider", 150,
            "Decide what to do with this raider scum");
    public SecondaryQuest findNaskosSon = new SecondaryQuest("Find Nasko's son", 300,
            "Look for Nasko's son. Nasko's son needs to be alive.");
    public SecondaryQuest findStolenAmmo = new SecondaryQuest("Find stolen ammo", 250,
            "Find out what has happened to the ammunition");
    public SecondaryQuest findTheRanger = new SecondaryQuest("Find Orson", 500,
            "Find out what happened to Orson Krennik");
    public SecondaryQuest stealTheChems = new SecondaryQuest("Get the chems", 300,
            "Decide whether to help Alistair with his chem request");

    public SecondaryQuest(String name, int expGained, String description) {
        super(name, expGained, description);
        this.type = Type.SECONDARY;
        this.isCompleted = false;
        this.decisionMade = 0;
    }

    public void buildSecQuestList() {
        listofSecQuests.add(observer);
        listofSecQuests.add(dealWithWoundedRaider);
        listofSecQuests.add(findNaskosSon);
        listofSecQuests.add(findStolenAmmo);
        listofSecQuests.add(findTheRanger);
        listofSecQuests.add(stealTheChems);
    }

}
