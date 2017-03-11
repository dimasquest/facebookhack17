import map.GameMap;
import map.Square;
import messages.StartStory;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello stranger, your journey into the post-apocalptic America is about to begin.\n");
        System.out.println("Choose your character:\n" +
                "Press enter to start.");
        Scanner user_input = new Scanner(System.in);
        StartStory story = new StartStory();

        System.in.read();
        story.getBiStory();
        System.in.read();
        story.getDocStory();
        System.in.read();
        story.getAxelStory();
        System.in.read();
        story.getCiaraStory();
        System.in.read();
        story.getRachelStory();

        System.out.println("\n\n\nEnter the number of your hero:");

        int n = user_input.nextInt();
        story.getStory(n);
        System.out.println("End of test");

        GameMap map = new GameMap();
        map.display();
    }
}
