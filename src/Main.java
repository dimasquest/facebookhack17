import Characters.Attributes;
import Characters.AttributesNames;
import Characters.Character;
import Characters.Jobs;
import Items.Guns;
import Items.HealthRelated;
import Items.Miscellaneous;
import game.Combat;
import game.GameState;
import map.GameMap;
import map.Square;
import messages.*;
import quests.MainQuest;
import quests.SecondaryQuest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Items.Armor.*;

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
    Messages message = new Messages();
    RaiderStories raiderStories = new RaiderStories();
    FriendlyStories friendlyStories = new FriendlyStories();
    GameState state = new GameState();


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
    Character player = null;
    Character sheriff, bartender, hotelManager, priest, child,
    raider1, raider2, raider3, raider4, raiderJet, raiderScrum, raiderAjax, raiderAstra, raiderBiggy;
    char previousChar, nextCharacter;
    MainQuest quest;
    SecondaryQuest secQuest;



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
    bartenderGuns.add(Guns.LIGHT_PISTOL);
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
    priestGuns.add(Guns.SHOTGUN);
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
    raider1Guns.add(Guns.HEAVY_PISTOL);
    List<HealthRelated> raider1HealthBoosters = new ArrayList<>();
    List<Miscellaneous> raider1Miscellaneous = new ArrayList<>();

    raider1 = new Character("Raider 1", Jobs.RAIDER,
        raider1Attributes, raider1Guns, raider1HealthBoosters,
        raider1Miscellaneous, map.getSquare(75, 51));
    raider1.getPosition().setC('^');
    raider1.setArmor(LIGHT_METAL);

    List<Attributes> raider2Attributes = new ArrayList<>();
    raider2Attributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    raider2Attributes.add(new Attributes(AttributesNames.STRENGTH, 8));
    raider2Attributes.add(new Attributes(AttributesNames.INTELLIGENCE, 5));
    raider2Attributes.add(new Attributes(AttributesNames.LUCK, 2));
    raider2Attributes.add(new Attributes(AttributesNames.CHARISMA, 1));
    raider2Attributes.add(new Attributes(AttributesNames.REPUTATION, 0));

    List<Guns> raider2Guns = new ArrayList<>();
    raider2Guns.add(Guns.M1);
    List<HealthRelated> raider2HealthBoosters = new ArrayList<>();
    List<Miscellaneous> raider2Miscellaneous = new ArrayList<>();

    raider2 = new Character("Raider 2", Jobs.RAIDER,
        raider2Attributes, raider2Guns, raider2HealthBoosters,
        raider2Miscellaneous, map.getSquare(50, 49));
    raider2.getPosition().setC('^');
    raider2.setArmor(SCRAP);

    List<Attributes> raider3Attributes = new ArrayList<>();
    raider3Attributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    raider3Attributes.add(new Attributes(AttributesNames.STRENGTH, 8));
    raider3Attributes.add(new Attributes(AttributesNames.INTELLIGENCE, 5));
    raider3Attributes.add(new Attributes(AttributesNames.LUCK, 2));
    raider3Attributes.add(new Attributes(AttributesNames.CHARISMA, 1));
    raider3Attributes.add(new Attributes(AttributesNames.REPUTATION, 0));

    List<Guns> raider3Guns = new ArrayList<>();
    raider3Guns.add(Guns.REVOLVER);
    List<HealthRelated> raider3HealthBoosters = new ArrayList<>();
    List<Miscellaneous> raider3Miscellaneous = new ArrayList<>();

    raider3 = new Character("Raider 3", Jobs.RAIDER,
        raider3Attributes, raider3Guns, raider3HealthBoosters,
        raider3Miscellaneous, map.getSquare(51, 135));
    raider3.getPosition().setC('^');
    raider3.setArmor(HEAVY_METAL);

    List<Attributes> raider4Attributes = new ArrayList<>();
    raider4Attributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    raider4Attributes.add(new Attributes(AttributesNames.STRENGTH, 8));
    raider4Attributes.add(new Attributes(AttributesNames.INTELLIGENCE, 5));
    raider4Attributes.add(new Attributes(AttributesNames.LUCK, 2));
    raider4Attributes.add(new Attributes(AttributesNames.CHARISMA, 1));
    raider4Attributes.add(new Attributes(AttributesNames.REPUTATION, 0));

    List<Guns> raider4Guns = new ArrayList<>();
    raider4Guns.add(Guns.M4);
    List<HealthRelated> raider4HealthBoosters = new ArrayList<>();
    List<Miscellaneous> raider4Miscellaneous = new ArrayList<>();

    raider4 = new Character("Raider 4", Jobs.RAIDER,
        raider4Attributes, raider4Guns, raider4HealthBoosters,
        raider4Miscellaneous, map.getSquare(79, 117));
    raider4.getPosition().setC('^');
    raider4.setArmor(LIGHT_METAL);

    List<Attributes> raiderJetAttributes = new ArrayList<>();
    raiderJetAttributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
    raiderJetAttributes.add(new Attributes(AttributesNames.STRENGTH, 8));
    raiderJetAttributes.add(new Attributes(AttributesNames.INTELLIGENCE, 5));
    raiderJetAttributes.add(new Attributes(AttributesNames.LUCK, 2));
    raiderJetAttributes.add(new Attributes(AttributesNames.CHARISMA, 1));
    raiderJetAttributes.add(new Attributes(AttributesNames.REPUTATION, 0));

    List<Guns> raiderJetGuns = new ArrayList<>();
    raiderJetGuns.add(Guns.M4);
    List<HealthRelated> raiderJetHealthBoosters = new ArrayList<>();
    List<Miscellaneous> raiderJetMiscellaneous = new ArrayList<>();

    raiderJet = new Character("Jet", Jobs.RAIDER,
            raiderJetAttributes, raiderJetGuns, raiderJetHealthBoosters,
            raiderJetMiscellaneous, map.getSquare(30, 100));
    raiderJet.getPosition().setC('^');
    raiderJet.setArmor(LIGHT_METAL);
    raiderJet.setHealth(130);

    raiderScrum = new Character("Scrum", Jobs.RAIDER, raider1Attributes, raider1Guns,
            raider1HealthBoosters, raider1Miscellaneous, map.getSquare(66,66));
    raiderScrum.setHealth(160);
    raiderScrum.setGunInHand(Guns.SHOTGUN);
    raiderScrum.setArmor(SCRAP);

    raiderBiggy = new Character("Scrum", Jobs.RAIDER, raider1Attributes, raider1Guns,
            raider1HealthBoosters, raider1Miscellaneous, map.getSquare(100,87));
    raiderBiggy.setHealth(200);
    raiderBiggy.setGunInHand(Guns.AXE);
    raiderBiggy.setArmor(HEAVY_METAL);

    raiderAjax = new Character("Scrum", Jobs.RAIDER, raider1Attributes, raider1Guns,
            raider1HealthBoosters, raider1Miscellaneous, map.getSquare(66,66));
    raiderAjax.setHealth(300);
    raiderAjax.setGunInHand(Guns.M1);
    raiderAjax.setArmor(EXOSKELETON);

//
//
//

    List<Guns> raiderAstraGuns = new ArrayList<>();
    raiderAstraGuns.add(Guns.REVOLVER);

    raiderAstra = new Character("Astra", Jobs.RAIDER,
            raider4Attributes, raiderAstraGuns, raider4HealthBoosters,
            raider4Miscellaneous, map.getSquare(85, 117));
    raiderAstra.getPosition().setC('^');
    raiderAstra.setArmor(LIGHT_METAL);
    raiderAstra.setHealth(120);

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
        player.setArmor(SCRAP);

      case 2:
        playerAttributes.get(1).setAttributeValue(4);
        playerAttributes.get(2).setAttributeValue(7);
        playerAttributes.get(3).setAttributeValue(4);
        playerAttributes.get(4).setAttributeValue(5);
        playerAttributes.get(5).setAttributeValue(10);
        playerGuns.add(Guns.LIGHT_PISTOL);
        player = new Character("Harp", Jobs.PLAYER, playerAttributes, playerGuns,
            playerHealthBoosters, playerMiscellaneous, position);
        player.setArmor(LIGHT_METAL);

      case 3:
        playerAttributes.get(1).setAttributeValue(9);
        playerAttributes.get(2).setAttributeValue(5);
        playerAttributes.get(3).setAttributeValue(2);
        playerAttributes.get(4).setAttributeValue(1);
        playerGuns.add(Guns.SHOTGUN);
        player = new Character("Axel", Jobs.PLAYER, playerAttributes, playerGuns,
            playerHealthBoosters, playerMiscellaneous, position);
        player.setArmor(HEAVY_METAL);

      case 4:
        playerAttributes.get(1).setAttributeValue(5);
        playerAttributes.get(2).setAttributeValue(4);
        playerAttributes.get(3).setAttributeValue(8);
        playerAttributes.get(4).setAttributeValue(6);
        playerAttributes.get(5).setAttributeValue(10);
        playerGuns.add(Guns.M4);
        player = new Character("Ciara", Jobs.PLAYER, playerAttributes,playerGuns,
            playerHealthBoosters, playerMiscellaneous, position);
        player.setArmor(COMBAT_LIGHT);

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


//  HERE IS THE PLAYER
    player.showAttributes();
    System.in.read();
    map.getSquare(89, 50).setC('*');
    map.display();
    System.out.println("You see a figure on the horizon...");
    System.in.read();
    Combat combat = new Combat(player, raider1);
    combat.attack();
    System.out.println("What a warm welcome. Lets keep moving.");
    System.in.read();
    System.out.println("You are now free to explore the city and the surroundings.\n" +
            "To proceed through the main story you need to complete the Q marks.\n" +
            "To try to obtain better equipment you need to go to § signs.\n" +
            "Galon town is about to get destroyed, go save it!\n");


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
          player.setPosition(map.getSquare(position.getX() - 1, position.getY()));
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
          player.setPosition(map.getSquare(position.getX(), position.getY() -
          1));
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
          player.setPosition(map.getSquare(position.getX() + 1, position
              .getY()));
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
          player.setPosition(map.getSquare(position.getX(), position.getY() +
          1));
          position = map.getSquare(position.getX(), position.getY() + 1);
          map.display();
          break;
        default: continue;
      }

      if (player.getPosition().equals(map.getSquare(82, 49))) {
        quest = new MainQuest("To the gates!", 500,
            "Enemies are storming into the city, protect it!");
        System.out.println("There are 2 raiders approaching, fight them!");
        combat.setEnemy(raider1);
        combat.attack();
        System.out.println("One more!");
        combat.attack();
        System.out.println("City is defended, well done!");
        message.needHealing(player);
        state.levelUp(500);
      }

      if (player.getPosition().equals(map.getSquare(51, 49))) {
        quest = new MainQuest("Who is this guy?",
            750,
            "Find a way to identify the stranger.");
        System.out.println("You see a mayor having a late visiter.");
        friendlyStories.getMayor();
        System.out.println("The vivtor has disappeared very quickly.");
      }

      if (player.getPosition().equals(map.getSquare(65, 60))) {
        quest = new MainQuest("Identify the " +
            "traitor", 1000,
            "There is definitely a traitor amongst us. Find out who that is.");
      }

      if (player.getPosition().equals(map.getSquare(61, 40))) {
        quest = new MainQuest("Protect the town", 1500,
            "The town is on fire! Protect it!");
      }

      if (player.getPosition().equals(map.getSquare(49, 118))) {
        quest = new MainQuest("Clear the ruins", 2000,
            "Defeat the raiders in the ruins. That is their base.");
      }

      if (player.getPosition().equals(map.getSquare(79, 90))) {
        quest = new MainQuest("Find raider HQ", 1000,
            "Find where the main base is.");
      }
      if (player.getPosition().equals(map.getSquare(82, 25))) {
        quest = new MainQuest("Something ends, something begins", 3000,
            "Defeat the raiders in the last battle for the Wasteland!");
      }

      // Add SecondaryQuests
      if (player.getPosition().equals(map.getSquare(53, 65))) {
        secQuest = new SecondaryQuest("Observer", 100,
            "Walk around and check if anyone needs help.");
      }
      if (player.getPosition().equals(map.getSquare(79, 116))) {
        secQuest = new SecondaryQuest("Deal with the wounded raider", 150,
            "Decide what to do with this raider scum");
      }
      if (player.getPosition().equals(map.getSquare(42, 40))) {
        secQuest = new SecondaryQuest("Find Nasko's son", 300,
            "Look for Nasko's son. Nasko's son needs to be alive.");
      }
      if (player.getPosition().equals(map.getSquare(62, 109))) {
      secQuest = new SecondaryQuest("Find stolen ammo", 250,
          "Find out what has happened to the ammunition.");
      }
      if (player.getPosition().equals(map.getSquare(46, 19))) {
      secQuest = new SecondaryQuest("Find Orson", 500,
          "Find out what happened to Orson Krennik.");
      }
      if (player.getPosition().equals(map.getSquare(47, 80))) {
        secQuest = new SecondaryQuest("Get the chems", 300,
            "Decide whether to help Alistair with his chem request.");
      }

      if (player.getPosition().equals(map.getSquare(71, 90))) {
        System.out.println("You found a Revolver. Do you want to use it now? " +
            "[y/n]");
          player.getGuns().add(Guns.REVOLVER);
        if (user_input.next().equals("y")) {
          player.setGunInHand(Guns.REVOLVER);
        }
      }

      if (player.getPosition().equals(map.getSquare(74, 20))) {
        System.out.println("You found a Knife. Do you want to use it now? " +
            "[y/n]");
        player.getGuns().add(Guns.KNIFE);
        if (user_input.next().equals("y")) {
          player.setGunInHand(Guns.KNIFE);
        }
      }


      if (gameOver) {
        break;
      }
    }

  }

}
