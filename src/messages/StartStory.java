package messages;

import java.util.Scanner;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class StartStory {

    public String getName() {
        return name;
    }

    public StartStory(){

    }

    private String biStory;
    private String docStory;
    private String axelStory;
    private String ciaraStory;
    private String rachelStory;
    public String name;

    public void getStory(int c) {
        boolean flag = true;
        while (flag) {
        switch (c) {
            case 1:
                System.out.println("You chose Rohan.");
                flag = false;
                this.name = "Rohan";
                break;
            case 2:
                System.out.println("You chose Doc.");
                flag = false;
                this.name = "Harp";
                break;
            case 3:
                System.out.println("You chose Axel.");
                flag = false;
                this.name = "Axel";
                break;
            case 4:
                System.out.println("You chose Ciara.");
                flag = false;
                this.name = "Ciara";
                break;
            case 5:
                System.out.println("You chose Rachel.");
                flag = false;
                this.name = "Rachel";
                break;
            default:
                System.out.println("Invalid number");
                Scanner s = new Scanner(System.in);
                c = s.nextInt();
                break;
        }
        }

    }

    public void getBiStory() {
        System.out.println("Your name is Rohan, you are an ex-ranger commonly known as Big Iron and here is your story:");
        biStory = "You are an ex-ranger. The one who used to patrol the wasteland and protect the inhabitants.\n" +
                "Now you are in exlie after the story between the mayor and the gang : they used to have a common\ndrug business" +
                ", but you werent having that. Using full ranger authority, you shopped the trade by putting a bullet\ninto the gang " +
                "leader's head. Mayor, scared as he was, run to the public and declared you the enemy of the state.\nDespite the false accusations, " +
                "there was not much you could do about it. The entire town reacted swiftly and was ready to fire at will.\nYou chose to retreat and permanently leave "
                + "the town. Rangers are always needed, so you applied your skill in the Wasteland where the was enough\nmurderers, rapests and cannibals to deal with. " +
                "But a sudden message that you have received via the intercom last night has changed your plans...\n" +
                "someone in the town told you that raiders are planning to take over and mayor is happy for them to do so.\n" +
                "Its only up to you to prevent that from happening. Get the Big Iron on your hip and prepare for the long journey Ranger.";
        System.out.println(biStory);

    }

    public void getDocStory() {
        docStory = "Your name is Harp Castello. Local doctor, or Doc Castello as everyone calls you. That is a commonly known fact that\n" +
                "doctors get tired of fixing bullet wounds. And you decided that rather than fixing the wounds, you should stop the problem at its root: \n" +
                "the raiders. Their presence in the region is a lot more noticeable than it was before. They are attacking the traders and rading\n" +
                "the nearby farmers. At one point you even thought that it is probably easier to just leave the town and move up North. Many people\nshared your rather " +
                "pessimistic view and were ready to pack up and leave." +
                "But a sudden message that you have received via the intercom last night\nhas changed your plans... " +
                "someone in the town told you that raiders are planning to take over and mayor is happy for them to do so.\n" +
                "Doc, you are meant to help people in any way possible. Would you murder to save your community?";
        System.out.println(docStory);

    }

    public void getAxelStory() {
        System.out.println("Your name is Axel, you are an ex-raider and here is your story:");
        axelStory = "Not every rader is a raider for life. Some change for the best and leave this community for the best. You are called Axel \n" +
                "and you are on of those people. Having enough of that life you decided to quit. Ajax was not a happy man. He ordered to have\n" +
                "your head on the pike. Despite some body damage (i.e. having a massive scar in the middle of your face) you managed to escape into the \n" +
                "wasteland. Surviving on your own for months has taught you a lot including the fact that is there is a chance for you to get \n" +
                "backstabbed, that will inevitably happen. Amount of people who thought they could just use you and then finish it was a good representation \n" +
                "of why people deserved this apocalypse in the first place. Finally you found a place to settle: Galom. Community accepted you despite the \n" +
                "background and allowed you to quitly retire as a local blacksmith. But a sudden message that you have received via the intercom last night\n" +
                "has changed your plans... " + "someone in the town told you that raiders are planning to take over and mayor is happy for them to do so. \n" +
                "Could you turn against those monsters once again if that saves your new family, Axel?";
        System.out.println(axelStory);

    }

    public void getCiaraStory() {
        System.out.println("Your name is Ciara, you are a head of Security in Galom and here is your story:");
        ciaraStory = "Being a guard at Galom is a very hard job. Constant attacks of raiders, mutants and other scum keeps you busy\n" +
                "Being very quick and agile since your childhood you were made for this job. Quick reaction, fast reflexes, steady aim \n" +
                "- all you need to excel as a guard. That was the thought. But recently you started to think that one guard being good doesnt \n" +
                "really help the entire town to stay away from raiders. You need more people with the similar skills, so you started training\n" +
                "excellent soldiers to help the town at that. Being an instructor in Delta team has impacted you a lot. Skills, drills and \n" +
                "comrades who would be willing to die for you - all that could potentially save the town from anything. At least thats what you have\n" +
                "thought before you saw a group of 20+ raiders in front of the town gate. Mayor's intercom is not responding and the rest of the guards\n" +
                "have disappeard, except for your personal death squadron of course. Are you ready to do your job Ciara? Even if by protecting the \n" +
                "others you are risking your own life?";
        System.out.println(ciaraStory);

    }

    public void getRachelStory() {
        System.out.println("Your name is Rachel, you are a scientist at Galom College and here is your story:");
        rachelStory = "Intelligence wins wars. Thats your attitude to life. Being a scientist in the town built in the middle \n" +
                "of radioactive wasteland is hard. No one really appreciates your work. Which is unfair, considering that the effects of your work are\n" +
                "vital in long term. You can potentially clean up the wasteland and get rid of the deadly radiation. By experimenting with mutated \n" +
                "animals and playing around with their DNA. These experiments could save the humanity. Provided you manage to complete them\n" +
                "of course. There are certain people that would prefer simpler pleasures : sex, drugs and violence. And they do not need poeple\n" +
                "like you in the way. Or people who would be willing to help you. Thats why you got very concerned when you heard screaming outside\n" +
                "of your laboratory. Turns out that these bastards got closer than you could have expected. They are attacking the front gate of Galom.\n" +
                "What would you do Rachel? Save the results of your experiments or go for saving people outside of your precious lab?";
        System.out.println(rachelStory);

    }
}
