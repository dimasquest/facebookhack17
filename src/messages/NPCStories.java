package messages;

/**
 * Created by dimarammfire on 11.03.17.
 */
public abstract class NPCStories {

    public String story;

    public NPCStories(String story) {
        this.story = story;
    }

    public void showStory() {
        System.out.println(story);
    }

}
