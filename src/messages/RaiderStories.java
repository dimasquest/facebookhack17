package messages;

import java.util.Scanner;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class RaiderStories extends NPCStories {

    private String name;


    public RaiderStories() {
    }

    public void getStory(String name) {
        boolean flag = true;
        while (flag) {
            switch (name) {
                case "Jet":
                    getJetStory();
                    flag = false;
                    break;
                case "Scrum":
                    getScrumStory();
                    flag = false;
                    break;
                case "Biggy":
                    getBiggyStory();
                    flag = false;
                    break;
                case "Astra":
                    getAstraStory();
                    flag = false;
                    break;
                case "Ajax":
                    getAjaxStory();
                    flag = false;
                    break;
                default:
                    System.out.println("A normal raider. One of the pack. Can't be too hard.");
                    flag = false;
                    break;
            }
        }

    }

    public void getAjaxStory() {
        String ajaxStory = "Ajax is the leader of the raider community. He the strongest bloke in the Wastes. His raider career" +
                " started when he murdered a farmer's son at the age of 14. Ever since he enjoyed making the others suffer. If you somehow manage to make the guy disappear, " +
                " the local community of Galen would praise you.";
        System.out.println(ajaxStory);
    }

    public void getJetStory() {
        String jetStory = "The one who is constantly on drugs. If you need a quick fix up - ask Jet. He has a name for a reason though: quick as hell, as agile as a snake. Have fun fighting him.";
        System.out.println(jetStory);
    }

    public void getScrumStory() {
        String scrumStory = "Very sneaky bastard. Never attacks from the front. Beware of backstabbing.";
        System.out.println(scrumStory);
    }

    public void getAstraStory() {
        String astraStory = "First woman in the raider community who managed to become an elite warrior and is respected by all the members of the gang. Piss her off and she will put a bullet into your guts.";
        System.out.println(astraStory);
    }

    public void getBiggyStory() {
        String biggyStory = "Brute force of the gang. Ruthless and unstoppable. Heavy like a train. If he charges at you with his axe, you better hope he misses...";
        System.out.println(biggyStory);
    }
}
