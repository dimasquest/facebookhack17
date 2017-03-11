package messages;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class StartStory {

    public StartStory(){}

    private String biStory;
    private String docStory;
    private String axelStory;
    private String ciaraStory;
    private String rachelStory;

    public void getBiStory() {
        biStory = " You are an ex-ranger. The one who used to patrol the wasteland and protect the inhabitants. \n" +
                " Now you are in exlie after the story between the mayor and the gang : they used to have a common\n drug business " +
                ", but you werent having that. Using full ranger authority, you shopped the trade by putting a bullet\n into the gang " +
                "leader's head. Mayor, scared as he was, run to the public and declared you the enemy of the state.\n Despite the false accusations, " +
                "there was not much you could do about it. The entire town reacted swiftly and was ready to fire at will.\n You chose to retreat and permanently leave "
                + "the town. Rangers are always needed, so you applied your skill in the Wasteland where the was enough\n murderers, rapests and cannibals to deal with. " +
                "But a sudden message that you have received via the intercom last night has changed your plans...\n " +
                "someone in the town told you that raiders are planning to take over and mayor is happy for them to do so.\n" +
                " Its only up to you to prevent that from happening. Get the Big Iron on your hip and prepare for the long journey Ranger.";
        System.out.println(biStory);
    }

    public void getDocStory() {
        docStory = "Your name is Harp Castello. Local doctor, or Doc Castello as everyone calls you. That is a commonly known fact that\n " +
                "doctors get tired of fixing bullet wounds. And you decided that rather than fixing the wounds, you should stop the problem at its root: \n" +
                "the raiders. Their presence in the region is a lot more noticeable than it was before. They are attacking the traders and rading\n " +
                "the nearby farmers. At one point you even thought that it is probably easier to just leave the town and move up North. Many people\n shared your rather " +
                "pessimistic view and were ready to pack up and leave." +
                "But a sudden message that you have received via the intercom last night\n has changed your plans... " +
                "someone in the town told you that raiders are planning to take over and mayor is happy for them to do so.\n" +
                "Doc, you are meant to help people in any way possible. Would you murder to save your community?";
        System.out.println(docStory);
    }

    public void getAxelStory() {
        axelStory = "Not every rader is a raider for life. Some change for the best and leave this community for the best. You are called Axel \n" +
                "and you are on of those people. Having enough of that life you decided to quit. Ajax was not a happy man. He ordered to have\n" +
                " your head on the pike. Despite some body damage (i.e. having a massive scar in the middle of your face) you managed to escape into the \n" +
                " wasteland. Surviving on your own for months has taught you a lot including the fact that is there is a chance for you to get \n" +
                "backstabbed, that will inevitably happen. Amount of people who thought they could just use you and then finish it was a good representation \n" +
                "of why people deserved this apocalypse in the first place. Finally you found a place to settle: Galom. Community accepted you despite the \n" +
                "background and allowed you to quitly retire as a local blacksmith. But a sudden message that you have received via the intercom last night\n has changed your plans... " +
                "someone in the town told you that raiders are planning to take over and mayor is happy for them to do so. \n" +
                "Could you turn against those monsters once again if that saves your new family, Axel?";
        System.out.println(axelStory);
    }

    public void getCiaraStory() {
        ciaraStory = " Being a guard at Galom is a very hard job. Constant attacks of raiders, mutants and other scum keeps you busy\n";
    }

    public void getRachelStory() {
    }
}
