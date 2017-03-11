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
    Character player, sheriff, bartender, hotelManager, priest, child, raider;
    char previousChar, nextCharacter;

    List<Attributes> playerAttributes = new ArrayList<>();
    playerAttributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    playerAttributes.add(new Attributes(AttributesNames.STRENGTH, 0));
    playerAttributes.add(new Attributes(AttributesNames.INTELLIGENCE, 0));
    playerAttributes.add(new Attributes(AttributesNames.LUCK, 0));
    playerAttributes.add(new Attributes(AttributesNames.CHARISMA, 0));
    playerAttributes.add(new Attributes(AttributesNames.REPUTATION, 0));

    List<Guns> playerGuns = new ArrayList<>();
    List<HealthRelated> playerHealthBoosters = new ArrayList<>();
    List<Miscellaneous> playerMiscellaneous = new ArrayList<>();

    Square position = map.getSquare(89, 50);
    previousChar = '|';

    // Initialise sheriff
    List<Attributes> sheriffAttributes = new ArrayList<>();
    sheriffAttributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    sheriffAttributes.add(new Attributes(AttributesNames.STRENGTH, 9));
    sheriffAttributes.add(new Attributes(AttributesNames.INTELLIGENCE, 3));
    sheriffAttributes.add(new Attributes(AttributesNames.LUCK, 3));
    sheriffAttributes.add(new Attributes(AttributesNames.CHARISMA, 2));
    sheriffAttributes.add(new Attributes(AttributesNames.REPUTATION, 8));

    List<Guns> sheriffGuns = new ArrayList<>();
    sheriffGuns.add(Guns.REVOLVER);
    List<HealthRelated> sheriffHealthBoosters = new ArrayList<>();
    List<Miscellaneous> sheriffMiscellaneous = new ArrayList<>();

    sheriff = new Character("Sheriff", Jobs.SHERIFF, sheriffAttributes,
        sheriffGuns, sheriffHealthBoosters, sheriffMiscellaneous, map
        .getSquare(42, 75));
    sheriff.getPosition().setC('@');


    // Initialise bartender
    List<Attributes> bartenderAttributes = new ArrayList<>();
    bartenderAttributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    bartenderAttributes.add(new Attributes(AttributesNames.STRENGTH, 7));
    bartenderAttributes.add(new Attributes(AttributesNames.INTELLIGENCE, 1));
    bartenderAttributes.add(new Attributes(AttributesNames.LUCK, 4));
    bartenderAttributes.add(new Attributes(AttributesNames.CHARISMA, 9));
    bartenderAttributes.add(new Attributes(AttributesNames.REPUTATION, 3));

    List<Guns> bartenderGuns = new ArrayList<>();
    bartenderGuns.add(Guns.KNIFE);
    List<HealthRelated> bartenderHealthBoosters = new ArrayList<>();
    List<Miscellaneous> bartenderMiscellaneous = new ArrayList<>();


    bartender = new Character("Bartender", Jobs.BARTENDER, bartenderAttributes,
        bartenderGuns, bartenderHealthBoosters, bartenderMiscellaneous, map
        .getSquare(46, 15));
    bartender.getPosition().setC('$');


    // Initialise hotel manager
    List<Attributes> hotelManagerAttributes = new ArrayList<>();
    hotelManagerAttributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    hotelManagerAttributes.add(new Attributes(AttributesNames.STRENGTH, 2));
    hotelManagerAttributes.add(new Attributes(AttributesNames.INTELLIGENCE, 9));
    hotelManagerAttributes.add(new Attributes(AttributesNames.LUCK, 4));
    hotelManagerAttributes.add(new Attributes(AttributesNames.CHARISMA, 9));
    hotelManagerAttributes.add(new Attributes(AttributesNames.REPUTATION, 3));

    List<Guns> hotelManagerGuns = new ArrayList<>();
    hotelManagerGuns.add(Guns.KNIFE);
    List<HealthRelated> hotelManagerHealthBoosters = new ArrayList<>();
    List<Miscellaneous> hotelManagerMiscellaneous = new ArrayList<>();


    hotelManager = new Character("Hotel Manager", Jobs.HOTEL_MANAGER,
        hotelManagerAttributes, hotelManagerGuns, hotelManagerHealthBoosters,
        hotelManagerMiscellaneous, map.getSquare(63, 20));
    hotelManager.getPosition().setC('&');

    // Initialise priest
    List<Attributes> priestAttributes = new ArrayList<>();
    priestAttributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    priestAttributes.add(new Attributes(AttributesNames.STRENGTH, 2));
    priestAttributes.add(new Attributes(AttributesNames.INTELLIGENCE, 9));
    priestAttributes.add(new Attributes(AttributesNames.LUCK, 4));
    priestAttributes.add(new Attributes(AttributesNames.CHARISMA, 9));
    priestAttributes.add(new Attributes(AttributesNames.REPUTATION, 3));

    List<Guns> priestGuns = new ArrayList<>();
    priestGuns.add(Guns.KNIFE);
    List<HealthRelated> priestHealthBoosters = new ArrayList<>();
    List<Miscellaneous> priestMiscellaneous = new ArrayList<>();


    priest = new Character("Priest", Jobs.PRIEST,
        priestAttributes, priestGuns, priestHealthBoosters,
        priestMiscellaneous, map.getSquare(39, 42));
    priest.getPosition().setC('+');

    // Initialise child
    List<Attributes> childAttributes = new ArrayList<>();
    childAttributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    childAttributes.add(new Attributes(AttributesNames.STRENGTH, 0));
    childAttributes.add(new Attributes(AttributesNames.INTELLIGENCE, 1));
    childAttributes.add(new Attributes(AttributesNames.LUCK, 7));
    childAttributes.add(new Attributes(AttributesNames.CHARISMA, 10));
    childAttributes.add(new Attributes(AttributesNames.REPUTATION, 0));

    List<Guns> childGuns = new ArrayList<>();
    childGuns.add(Guns.KNIFE);
    List<HealthRelated> childHealthBoosters = new ArrayList<>();
    List<Miscellaneous> childMiscellaneous = new ArrayList<>();


    child = new Character("Child", Jobs.CHILD,
        childAttributes, childGuns, childHealthBoosters,
        childMiscellaneous, map.getSquare(55, 79));
    child.getPosition().setC('%');

    // Initialise raider

    List<Attributes> raiderAttributes = new ArrayList<>();
    raiderAttributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    raiderAttributes.add(new Attributes(AttributesNames.STRENGTH, 8));
    raiderAttributes.add(new Attributes(AttributesNames.INTELLIGENCE, 5));
    raiderAttributes.add(new Attributes(AttributesNames.LUCK, 2));
    raiderAttributes.add(new Attributes(AttributesNames.CHARISMA, 1));
    raiderAttributes.add(new Attributes(AttributesNames.REPUTATION, 0));

    List<Guns> raiderGuns = new ArrayList<>();
    raiderGuns.add(Guns.KNIFE);
    List<HealthRelated> raiderHealthBoosters = new ArrayList<>();
    List<Miscellaneous> raiderMiscellaneous = new ArrayList<>();

    raider = new Character("Raider", Jobs.RAIDER,
        raiderAttributes, raiderGuns, raiderHealthBoosters,
        raiderMiscellaneous, map.getSquare(75, 51));
    raider.getPosition().setC('^');

    // Initialise player
    int n = user_input.nextInt();
    story.getStory(n);
    switch (n) {
      case 1:
        playerAttributes.get(1).setAttributeValue(7);
        playerAttributes.get(2).setAttributeValue(5);
        playerAttributes.get(3).setAttributeValue(2);
        playerAttributes.get(4).setAttributeValue(4);
        playerGuns.add(Guns.BIG_IRON);
        player = new Character("Rohan", Jobs.PLAYER, playerAttributes, playerGuns,
            playerHealthBoosters, playerMiscellaneous, position);

      case 2:
        playerAttributes.get(1).setAttributeValue(4);
        playerAttributes.get(2).setAttributeValue(7);
        playerAttributes.get(3).setAttributeValue(4);
        playerAttributes.get(4).setAttributeValue(5);
        playerAttributes.get(5).setAttributeValue(10);
        playerGuns.add(Guns.LIGHT_PISTOL);
        player = new Character("Harp", Jobs.PLAYER, playerAttributes, playerGuns,
            playerHealthBoosters, playerMiscellaneous, position);

      case 3:
        playerAttributes.get(1).setAttributeValue(9);
        playerAttributes.get(2).setAttributeValue(5);
        playerAttributes.get(3).setAttributeValue(2);
        playerAttributes.get(4).setAttributeValue(1);
        playerGuns.add(Guns.SHOTGUN);
        player = new Character("Axel", Jobs.PLAYER, playerAttributes, playerGuns,
            playerHealthBoosters, playerMiscellaneous, position);

      case 4:
        playerAttributes.get(1).setAttributeValue(5);
        playerAttributes.get(2).setAttributeValue(4);
        playerAttributes.get(3).setAttributeValue(8);
        playerAttributes.get(4).setAttributeValue(6);
        playerAttributes.get(5).setAttributeValue(10);
        playerGuns.add(Guns.M4);
        player = new Character("Ciara", Jobs.PLAYER, playerAttributes,playerGuns,
            playerHealthBoosters, playerMiscellaneous, position);

      case 5:
        playerAttributes.get(1).setAttributeValue(2);
        playerAttributes.get(2).setAttributeValue(9);
        playerAttributes.get(3).setAttributeValue(3);
        playerAttributes.get(4).setAttributeValue(5);
        playerAttributes.get(5).setAttributeValue(10);
        playerGuns.add(Guns.LIGHT_PISTOL);
        player = new Character("Rachel", Jobs.PLAYER, playerAttributes, playerGuns,
            playerHealthBoosters, playerMiscellaneous, position);
    }
    map.getSquare(89, 50).setC('*');
    map.display();

    boolean gameOver = false;
    while (!gameOver) {
      String move = user_input.next();
      map.getSquare(position.getX(), position.getY()).setC(previousChar);
      switch (move) {
        case "w":
          if (!map.isValidMove(position.getX() - 1, position.getY())) {
            System.out.println("This is not a valid move. Please try another " +
                "one!");
            break;
          }
          previousChar = map.getSquare(position.getX() - 1, position.getY())
              .getC();
          map.setSquare(position.getX(), position.getY(), -1, 0);
          position = map.getSquare(position.getX() - 1, position.getY());
          map.display();
          break;
        case "a":
          if (!map.isValidMove(position.getX(), position.getY() - 1)) {
            System.out.println("This is not a valid move. Please try another " +
                "one!");
            break;
          }
          previousChar = map.getSquare(position.getX(), position.getY() - 1)
              .getC();
          map.setSquare(position.getX(), position.getY(), 0, -1);
          position = map.getSquare(position.getX(), position.getY() - 1);
          map.display();
          break;
        case "s":
          if (!map.isValidMove(position.getX() + 1, position.getY())) {
            System.out.println("This is not a valid move. Please try another " +
                "one!");
            break;
          }
          previousChar = map.getSquare(position.getX() + 1, position.getY())
              .getC();
          map.setSquare(position.getX(), position.getY(), 1, 0);
          position = map.getSquare(position.getX() + 1, position.getY());
          map.display();
          break;
        case "d":
          if (!map.isValidMove(position.getX(), position.getY() + 1)) {
            System.out.println("This is not a valid move. Please try another " +
                "one!");
            break;
          }
          previousChar = map.getSquare(position.getX(), position.getY() + 1)
              .getC();
          map.setSquare(position.getX(), position.getY(), 0, 1);
          position = map.getSquare(position.getX(), position.getY() + 1);
          map.display();
          break;
      }
      if (gameOver) {
        break;
      }
    }

  }

}
