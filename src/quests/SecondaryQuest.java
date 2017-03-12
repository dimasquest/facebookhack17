package quests;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class SecondaryQuest extends Quest {

    // public List<SecondaryQuest> listofSecQuests = new ArrayList<>();


    public SecondaryQuest(String name, int expGained, String description) {
        super(name, expGained, description);
        this.type = Type.SECONDARY;
        this.isCompleted = false;
        this.decisionMade = 0;
        System.out.println(name + "\n\n" + description + " Reward: " +
            expGained);
    }

  /*  public void buildSecQuestList() {
        listofSecQuests.add(observer);
        listofSecQuests.add(dealWithWoundedRaider);
        listofSecQuests.add(findNaskosSon);
        listofSecQuests.add(findStolenAmmo);
        listofSecQuests.add(findTheRanger);
        listofSecQuests.add(stealTheChems);
    }
*/
}