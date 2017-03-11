import Characters.Attributes;
import Characters.AttributesNames;
import Characters.Character;
import Characters.Jobs;
import Items.Guns;
import Items.HealthRelated;
import Items.Miscellaneous;
import map.GameMap;
import map.Square;
import messages.StartStory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("Hello stranger, your journey into the " +
        "post-apocalptic America is about to begin.\n" +
        "DISCLAIMER: GAME IS 18+ ONLY");
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

    GameMap map = new GameMap();
    Character player;
    char previousChar, nextCharacter;

    List<Attributes> attributes = new ArrayList<>();
    attributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    attributes.add(new Attributes(AttributesNames.STRENGTH, 0));
    attributes.add(new Attributes(AttributesNames.INTELLIGENCE, 0));
    attributes.add(new Attributes(AttributesNames.LUCK, 0));
    attributes.add(new Attributes(AttributesNames.CHARISMA, 0));
    attributes.add(new Attributes(AttributesNames.REPUTATION, 0));

    List<Guns> guns = new ArrayList<>();
    List<HealthRelated> healthBoosters = new ArrayList<>();
    List<Miscellaneous> miscellaneous = new ArrayList<>();

    Square position = map.getSquare(89, 50);
    previousChar = '|';

    int n = user_input.nextInt();
    story.getStory(n);
    switch (n) {
      case 1:
        attributes.get(1).setAttributeValue(7);
        attributes.get(2).setAttributeValue(5);
        attributes.get(3).setAttributeValue(2);
        attributes.get(4).setAttributeValue(4);
        guns.add(Guns.BIG_IRON);
        player = new Character("Rohan", Jobs.PLAYER, attributes, guns,
            healthBoosters, miscellaneous, position);

      case 2:
        attributes.get(1).setAttributeValue(4);
        attributes.get(2).setAttributeValue(7);
        attributes.get(3).setAttributeValue(4);
        attributes.get(4).setAttributeValue(5);
        attributes.get(5).setAttributeValue(10);
        guns.add(Guns.LIGHT_PISTOL);
        player = new Character("Harp", Jobs.PLAYER, attributes, guns,
            healthBoosters, miscellaneous, position);

      case 3:
        attributes.get(1).setAttributeValue(9);
        attributes.get(2).setAttributeValue(5);
        attributes.get(3).setAttributeValue(2);
        attributes.get(4).setAttributeValue(1);
        guns.add(Guns.SHOTGUN);
        player = new Character("Axel", Jobs.PLAYER, attributes, guns,
            healthBoosters, miscellaneous, position);

      case 4:
        attributes.get(1).setAttributeValue(5);
        attributes.get(2).setAttributeValue(4);
        attributes.get(3).setAttributeValue(8);
        attributes.get(4).setAttributeValue(6);
        attributes.get(5).setAttributeValue(10);
        guns.add(Guns.M4);
        player = new Character("Ciara", Jobs.PLAYER, attributes, guns,
            healthBoosters, miscellaneous, position);

      case 5:
        attributes.get(1).setAttributeValue(2);
        attributes.get(2).setAttributeValue(9);
        attributes.get(3).setAttributeValue(3);
        attributes.get(4).setAttributeValue(5);
        attributes.get(5).setAttributeValue(10);
        guns.add(Guns.LIGHT_PISTOL);
        player = new Character("Rachel", Jobs.PLAYER, attributes, guns,
            healthBoosters, miscellaneous, position);
    }
    map.getSquare(89, 50).setC('*');
    map.display();

    boolean gameOver = false;
    while (!gameOver) {
      String move = user_input.next();
      map.getSquare(position.getX(), position.getY()).setC(previousChar);
      switch (move) {
        case "w":
          previousChar = map.getSquare(position.getX() - 1, position.getY())
              .getC();
          map.setSquare(position.getX(), position.getY(), -1, 0);
          position = map.getSquare(position.getX() - 1, position.getY());
          break;
        case "a":
          previousChar = map.getSquare(position.getX(), position.getY() - 1)
              .getC();
          map.setSquare(position.getX(), position.getY(), 0, -1);
          position = map.getSquare(position.getX(), position.getY() - 1);
          break;
        case "s":
          previousChar = map.getSquare(position.getX() + 1, position.getY())
              .getC();
          map.setSquare(position.getX(), position.getY(), 1, 0);
          position = map.getSquare(position.getX() + 1, position.getY());
          break;
        case "d":
          previousChar = map.getSquare(position.getX(), position.getY() + 1)
              .getC();
          map.setSquare(position.getX(), position.getY(), 0, 1);
          position = map.getSquare(position.getX(), position.getY() + 1);
          break;
      }
      map.display();
      if (gameOver) {
        break;
      }
    }

  }

}
