import Characters.Attributes;
import Characters.AttributesNames;
import Characters.Character;
import Characters.Jobs;
import Items.Guns;
import Items.HealthRelated;
import Items.Miscellaneous;
import game.Combat;
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
    Character player, sheriff, bartender, hotelManager, priest, child,
    raider1, raider2, raider3, raider4;
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

    // Initialise raiders
    List<Attributes> raider1Attributes = new ArrayList<>();
    raider1Attributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    raider1Attributes.add(new Attributes(AttributesNames.STRENGTH, 8));
    raider1Attributes.add(new Attributes(AttributesNames.INTELLIGENCE, 5));
    raider1Attributes.add(new Attributes(AttributesNames.LUCK, 2));
    raider1Attributes.add(new Attributes(AttributesNames.CHARISMA, 1));
    raider1Attributes.add(new Attributes(AttributesNames.REPUTATION, 0));

    List<Guns> raider1Guns = new ArrayList<>();
    raider1Guns.add(Guns.KNIFE);
    List<HealthRelated> raider1HealthBoosters = new ArrayList<>();
    List<Miscellaneous> raider1Miscellaneous = new ArrayList<>();

    raider1 = new Character("Raider 1", Jobs.RAIDER,
        raider1Attributes, raider1Guns, raider1HealthBoosters,
        raider1Miscellaneous, map.getSquare(75, 51));
    raider1.getPosition().setC('^');

    List<Attributes> raider2Attributes = new ArrayList<>();
    raider2Attributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    raider2Attributes.add(new Attributes(AttributesNames.STRENGTH, 8));
    raider2Attributes.add(new Attributes(AttributesNames.INTELLIGENCE, 5));
    raider2Attributes.add(new Attributes(AttributesNames.LUCK, 2));
    raider2Attributes.add(new Attributes(AttributesNames.CHARISMA, 1));
    raider2Attributes.add(new Attributes(AttributesNames.REPUTATION, 0));

    List<Guns> raider2Guns = new ArrayList<>();
    raider2Guns.add(Guns.KNIFE);
    List<HealthRelated> raider2HealthBoosters = new ArrayList<>();
    List<Miscellaneous> raider2Miscellaneous = new ArrayList<>();

    raider2 = new Character("Raider 2", Jobs.RAIDER,
        raider2Attributes, raider2Guns, raider2HealthBoosters,
        raider2Miscellaneous, map.getSquare(50, 49));
    raider2.getPosition().setC('^');

    List<Attributes> raider3Attributes = new ArrayList<>();
    raider3Attributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    raider3Attributes.add(new Attributes(AttributesNames.STRENGTH, 8));
    raider3Attributes.add(new Attributes(AttributesNames.INTELLIGENCE, 5));
    raider3Attributes.add(new Attributes(AttributesNames.LUCK, 2));
    raider3Attributes.add(new Attributes(AttributesNames.CHARISMA, 1));
    raider3Attributes.add(new Attributes(AttributesNames.REPUTATION, 0));

    List<Guns> raider3Guns = new ArrayList<>();
    raider3Guns.add(Guns.KNIFE);
    List<HealthRelated> raider3HealthBoosters = new ArrayList<>();
    List<Miscellaneous> raider3Miscellaneous = new ArrayList<>();

    raider3 = new Character("Raider 3", Jobs.RAIDER,
        raider3Attributes, raider3Guns, raider3HealthBoosters,
        raider3Miscellaneous, map.getSquare(51, 135));
    raider3.getPosition().setC('^');

    List<Attributes> raider4Attributes = new ArrayList<>();
    raider4Attributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    raider4Attributes.add(new Attributes(AttributesNames.STRENGTH, 8));
    raider4Attributes.add(new Attributes(AttributesNames.INTELLIGENCE, 5));
    raider4Attributes.add(new Attributes(AttributesNames.LUCK, 2));
    raider4Attributes.add(new Attributes(AttributesNames.CHARISMA, 1));
    raider4Attributes.add(new Attributes(AttributesNames.REPUTATION, 0));

    List<Guns> raider4Guns = new ArrayList<>();
    raider4Guns.add(Guns.KNIFE);
    List<HealthRelated> raider4HealthBoosters = new ArrayList<>();
    List<Miscellaneous> raider4Miscellaneous = new ArrayList<>();

    raider4 = new Character("Raider 4", Jobs.RAIDER,
        raider4Attributes, raider4Guns, raider4HealthBoosters,
        raider4Miscellaneous, map.getSquare(79, 117));
    raider4.getPosition().setC('^');

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

      default:
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
    Combat combat = new Combat(player, raider);
    combat.attack();


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
