package messages;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class FriendlyStories extends NPCStories {


    public FriendlyStories(String story) {
        super(story);
    }

    public void showStory() {
        System.out.println(story);
    }

}
