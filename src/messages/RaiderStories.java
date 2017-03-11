package messages;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class RaiderStories extends NPCStories {

    private String AjaxStory = "Ajax is the leader of the raider community. He the strongest bloke in the Wastes. His raider career" +
            " started when he murdered a farmer's son at the age of 14. Ever since he enjoyed making the others suffer. If you somehow manage to make the guy disappear, " +
            " the local community of Galen would praise you.";
    private String JetStory = "The one who is constantly on drugs. If you need a quick fix up - ask Jet. He has a name for a reason though: quick as hell, as agile as a snake. Have fun fighting him.";
    private String ScrumStory = "Very sneaky bastard. Never attacks from the front. Beware of backstabbing.";
    private String AstraStory = "First woman in the raider community who managed to become an elite warrior and is respected by all the members of the gang. Piss her off and she will put a bullet into your guts.";
    private String BiggyStory = "Brute force of the gang. Ruthless and unstoppable. Heavy like a train. If he charges at you with his axe, you better hope he misses...";


    public RaiderStories(String story) {
        super(story);
    }

    public void showStory() {
        System.out.println(story);
    }

    public String getAjaxStory() {
        return AjaxStory;
    }

    public String getJetStory() {
        return JetStory;
    }

    public String getScrumStory() {
        return ScrumStory;
    }

    public String getAstraStory() {
        return AstraStory;
    }

    public String getBiggyStory() {
        return BiggyStory;
    }
}
