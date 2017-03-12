import Characters.Attributes;
import Characters.AttributesNames;
import Characters.Character;
import Characters.Jobs;
import Items.Guns;
import Items.HealthRelated;
import Items.Miscellaneous;
import decisions.FinalDecisions;
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
    Character player;
    int karma = 0;
    int strengthOfTown = 0;
    int strengthOfRaiders = 9;
    String input;
    FinalDecisions finalS = new FinalDecisions();
    String conditionP = "Condition passed!";
    String condF = "Condition failed!";


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
    Character sheriff, bartender, hotelManager, priest, child,
    raider1, raider2, raider3, raider4, raiderJet, raiderScrum, raiderAjax, raiderAstra, raiderBiggy;
    char previousChar, nextCharacter;
    MainQuest quest;
    SecondaryQuest secQuest;



    List<Attributes> playerAttributes = new ArrayList<>();
    playerAttributes.add(new Attributes(AttributesNames.STRENGTH, 0));
    playerAttributes.add(new Attributes(AttributesNames.INTELLIGENCE, 0));
    playerAttributes.add(new Attributes(AttributesNames.LUCK, 0));
    playerAttributes.add(new Attributes(AttributesNames.EXPERIENCE, 0));
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
            raider1HealthBoosters, raider1Miscellaneous, map.getSquare(30,30));
    raiderScrum.setHealth(160);
    raiderScrum.setGunInHand(Guns.SHOTGUN);
    raiderScrum.setArmor(SCRAP);

    raiderBiggy = new Character("Biggy", Jobs.RAIDER, raider1Attributes, raider1Guns,
            raider1HealthBoosters, raider1Miscellaneous, map.getSquare(89,87));
    raiderBiggy.setHealth(200);
    raiderBiggy.setGunInHand(Guns.AXE);
    raiderBiggy.setArmor(HEAVY_METAL);

    raiderAjax = new Character("Ajax", Jobs.RAIDER, raiderJetAttributes, raider1Guns,
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
        playerAttributes.get(0).setAttributeValue(7);
        playerAttributes.get(1).setAttributeValue(5);
        playerAttributes.get(2).setAttributeValue(2);
        playerAttributes.get(3).setAttributeValue(0);
        playerAttributes.get(4).setAttributeValue(4);
        playerGuns.add(Guns.BIG_IRON);
        player = new Character("Rohan", Jobs.PLAYER, playerAttributes, playerGuns,
            playerHealthBoosters, playerMiscellaneous, position);
        player.setArmor(SCRAP);break;

      case 2:
        playerAttributes.get(0).setAttributeValue(4);
        playerAttributes.get(1).setAttributeValue(7);
        playerAttributes.get(2).setAttributeValue(4);
        playerAttributes.get(3).setAttributeValue(0);
        playerAttributes.get(4).setAttributeValue(5);
        playerGuns.add(Guns.LIGHT_PISTOL);
        player = new Character("Harp", Jobs.PLAYER, playerAttributes, playerGuns,
            playerHealthBoosters, playerMiscellaneous, position);
        player.setArmor(LIGHT_METAL);break;

      case 3:
        playerAttributes.get(0).setAttributeValue(9);
        playerAttributes.get(1).setAttributeValue(5);
        playerAttributes.get(2).setAttributeValue(2);
        playerAttributes.get(3).setAttributeValue(0);
        playerAttributes.get(4).setAttributeValue(1);
        playerGuns.add(Guns.SHOTGUN);
        player = new Character("Axel", Jobs.PLAYER, playerAttributes, playerGuns,
            playerHealthBoosters, playerMiscellaneous, position);
        player.setArmor(HEAVY_METAL);break;

      case 4:
        playerAttributes.get(0).setAttributeValue(5);
        playerAttributes.get(1).setAttributeValue(4);
        playerAttributes.get(2).setAttributeValue(9);
        playerAttributes.get(3).setAttributeValue(0);
        playerAttributes.get(4).setAttributeValue(6);
        playerGuns.add(Guns.M4);
        player = new Character("Ciara", Jobs.PLAYER, playerAttributes,playerGuns,
            playerHealthBoosters, playerMiscellaneous, position);
        player.setArmor(COMBAT_LIGHT);break;

      default:
        playerAttributes.get(0).setAttributeValue(2);
        playerAttributes.get(1).setAttributeValue(9);
        playerAttributes.get(2).setAttributeValue(3);
        playerAttributes.get(3).setAttributeValue(0);
        playerAttributes.get(4).setAttributeValue(5);
        playerGuns.add(Guns.LIGHT_PISTOL);
        player = new Character("Rachel", Jobs.PLAYER, playerAttributes, playerGuns,
            playerHealthBoosters, playerMiscellaneous, position);break;
    }

    FriendlyStories friendlyStories = new FriendlyStories(player);
    GameState state = new GameState(player);


//  HERE IS THE PLAYER
    player.showAttributes();
    System.in.read();
    map.getSquare(89, 50).setC('*');
    map.display();
    System.out.println("You see a figure on the horizon...");
    System.in.read();
    Combat combat = new Combat(player, raider1);
    raider1.setHealth(50);
    combat.attack();
    System.out.println("What a warm welcome. Lets keep moving.");
    System.in.read();
    System.out.println("You are now free to explore the city and the surroundings.\n" +
            "To proceed through the main story you need to complete the Q marks.\n" +
            "To try to obtain better equipment you need to go to ! signs.\n" +
            "Galon town is about to get destroyed, go save it!\n");
    player.setHealth(120);

    boolean gameOver = false;
    while (!gameOver) {
      if (!player.isAlive()) {
        gameOver = true;
        break;
      }
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
        case "h" :
          System.out.println(player.getHealth() + " is your health.");
          break;
        case "x" :
          System.out.println("Your weapon is " + player.getGunInHand() + "\n" +
                  "and your armor is " + player.getArmor()); break;
        case "medic" :
          System.out.println("You spend 300 exp to heal");
          player.setHealth(110);break;
        case "dimas" : player.setHealth(500);
          System.out.println("CHEAT");
        player.setGunInHand(Guns.HECATE); break;
        case "exp" : state.levelUp(1200);
        default: continue;
      }

      if (player.getPosition().equals(map.getSquare(82, 49))) {
        quest = new MainQuest("To the gates!", 500,
            "Enemies are storming into the city, protect it!");
        System.out.println("There are 2 raiders approaching, fight them!");
        combat.setEnemy(raider1);
        raider1.setHealth(100);
        combat.attack();
        if (!player.isAlive()) {gameOver = true; break;}
        System.out.println("One more!");
        raider1.setHealth(50);
        combat.attack();
        if (!player.isAlive()) {gameOver = true; break;}
        System.out.println("City is defended, well done!");
        message.needHealing(player);
        state.levelUp(500);
        strengthOfRaiders--;
        strengthOfTown++;
        System.in.read();
        System.out.println("I need to see Sheriff to get the info on the situation...");
        friendlyStories.getSheriff();
        System.in.read();
        System.out.println("Lets roll! I know that there is a traitor to be identified now...");
      }

      if (player.getPosition().equals(map.getSquare(51, 49))) {
        quest = new MainQuest("Who is this guy?",
            750,
            "Find a way to identify the stranger.");
        System.out.println("You see a mayor having a late visiter.");
        friendlyStories.getMayor();
        System.out.println("The vivtor has disappeared very quickly.");
        friendlyStories.getChildM2();
        System.out.println("Do you want to threaten the kid to tell you the truth?");
        user_input =  new Scanner(System.in);
        System.in.read();
        if (user_input.toString().equals("y")) {
          karma--;
          System.out.println("He tells you that his dad was talking to one of the outsiders.\n" +
                  "Apparently he had at least 200kg of weignt in him. Must be Biggy. That helps.");
          state.levelUp(750);
          strengthOfTown++;
        }
        else if (player.getAttributes().get(1).getAttributeValue() > 7) {
          System.out.println(conditionP);
          System.in.read();
          System.out.println("You saw the size of the guy. And he was wearing the helmet covered in silicon.\n" +
                  "Biggy's famous helmet. Must be him. Must tell the Sheriff.");
          state.levelUp(750);
          strengthOfTown++;
        }
      }

      if (player.getPosition().equals(map.getSquare(65, 60))) {
        quest = new MainQuest("Identify the " +
            "traitor", 1000,
            "There is definitely a traitor amongst us. Find out who that is.");
        System.out.println("There is a traitor among us. Maybe even more than one. I need to find that rat.\n" +
                "There is a crowd of kids over there. Maybe they saw someone suspicious around?");
        System.in.read();
        friendlyStories.getChildF();
        System.in.read();
        friendlyStories.getChildM();
        System.out.println("I can only investigate one of them, the others will get scared and run off.\n" +
                "Who will that be? b/g");
        input = user_input.next();
        if (input.equals("b")) {
          System.out.println("Boy led me right into the ambush! Jet himself!");
          combat.setEnemy(raiderJet);
          player.setHealth(120);
          combat.attack();
          if (!player.isAlive()) {gameOver = true; break;}
          System.out.println("Hard fight, minus one of raider leaders. Still no idea who the traitor is...\n" +
                  "This boy will tell me whether he wants it or not!");
          strengthOfRaiders--;
          System.in.read();
          if (player.getAttributes().get(0).getAttributeValue() > 7) {
            System.out.println("Fuck, I'm not sure he is alive anymore... I was a bit too eager to get the info...");
            karma--;
          }
          else {
            System.out.println("Only a couple of threats and he told me all about these pricks.\n" +
                    "Mayor was an obvious one, but this kiddo Jeff with him? \n" +
                    "Would have never thought. I'll investigate him personally...");
            friendlyStories.getSecurity();
            System.in.read();
            System.out.println("Should I force him to talk or just ask him nicely? f/c");
            input = user_input.next();
            if (input.equals("f") && player.getAttributes().get(0).getAttributeValue() > 6) {
              System.out.println("Wasn't too hard. They use the church basement to get the illegal goods into the town \n" +
                      "alongside with the infiltrators. Sheriff needs to know.");
              strengthOfRaiders--;
              state.levelUp(1000);
              message.needHealing(player);
            }
            else if (input.equals("c") && player.getAttributes().get(4).getAttributeValue() > 6) {
              System.out.println("Wasn't too hard. They use the church basement to get the illegal goods into the town \n" +
                      "alongside with the infiltrators. Sheriff needs to know.");
              strengthOfRaiders--;
              state.levelUp(1000);
              karma++;
              message.needHealing(player);
            }
            else {
              System.out.println("He decided that a bullet in a head is a better idea than talking, well that's another opportunity missed...");
              strengthOfTown--;
              state.levelUp(1000);
              message.needHealing(player);
            }
          }
        }
      }

      if (player.getPosition().equals(map.getSquare(61, 40))) {
        quest = new MainQuest("Protect the town", 1500,
            "The town is on fire! Protect it!");
        System.out.println("Raiders here!");
        combat.setEnemy(raider4);
        combat.attack();
        if (!player.isAlive()) {gameOver = true; break;}
        System.out.println("One less to worry about!");
        state.levelUp(0);
        friendlyStories.getCit2();
        System.out.println("There are raiders running to the church! Shit, I also saw the guy who Sheriff\n" +
                "has pointed at throwing a grenade into the bar. What the hell do I do? g/r");
        input = user_input.next();
        if (input.equals("g")) {
          System.out.println("This prick is down! But the church is now in flames... Raiders got it...");
          state.levelUp(1500);
          message.needHealing(player);
          strengthOfRaiders--;
          karma--;
        }
        else {
          System.out.println("He wasn't worthy, people in chapel need my help! Another dick on the way!");
          combat.setEnemy(raider3);
          combat.attack();
          if (!player.isAlive()) {gameOver = true; break;}
          System.out.println("People are safe, that's the important part. Arsenal hidden behind the bar, however, is utterly destroyed...");
          state.levelUp(1500);
          message.needHealing(player);
          strengthOfRaiders--;
          strengthOfTown--;
        }
      }

      if (player.getPosition().equals(map.getSquare(49, 118))) {
        quest = new MainQuest("Clear the ruins", 2000,
            "Defeat the raiders in the ruins. That is their base.");
        System.out.println("Apparently that is where the snakes are hiding... Lets go in and see.");
        message.randomEncounters();
        System.out.println("I seem some of them, lets get ready for a fight!");
        combat.setEnemy(raider3);
        raider3.setHealth(90);
        combat.attack();
        if (!player.isAlive()) {gameOver = true; break;}
        message.needHealing(player);
        System.out.println("One more!");
        combat.setEnemy(raider2);
        raider2.setHealth(80);
        combat.attack();
        if (!player.isAlive()) {gameOver = true; break;}
        message.needHealing(player);
        System.out.println("And now Biggy himself. I was waiting for that you twat!");
        combat.setEnemy(raiderBiggy);
        System.in.read();
        combat.attack();
        if (!player.isAlive()) {gameOver = true; break;}
        message.needHealing(player);
        System.out.println("The hardest one so far. This guy was monstrous. I found a holotape\n" +
                "in one of his pockets. The base was moved into the old ranch. That's where I shall be heading!\n" +
                "I also need a better gun and armor, here is M1 and a combat armor.");
        player.setGunInHand(Guns.M1);
        player.setArmor(COMBAT_HEAVY);
        state.levelUp(2000);
        strengthOfRaiders--;
        strengthOfTown++;


      }

      if (player.getPosition().equals(map.getSquare(79, 90))) {
        quest = new MainQuest("Find raider HQ", 1000,
            "Find where the main base is.");
        System.out.println("Shit I got spotted! Ah wait, that's a little girl, maybe I can talk my way out?");
        if (player.getAttributes().get(4).getAttributeValue() > 6) {
          System.out.println("She calmed down and I stole the password quite easily. Now the last bastard that needs to be defeated...");
        }
        else {
          friendlyStories.getChildF2();
          System.out.println("Should I? y/n");
          input = user_input.next();
          if (input.equals("y")) {
            karma--;
            karma--;
            System.out.println("There are always sacrifices that need to be made.. Guess she was one of them...");
            state.levelUp(1000);
          }
          else {
            System.out.println("There goes my cover ... ");
            combat.setEnemy(raider4);
            raider4.setHealth(100);
            combat.attack();
            if (!player.isAlive()) {gameOver = true; break;}
            System.out.println("Another!");
            raider4.setHealth(110);
            combat.attack();
            if (!player.isAlive()) {gameOver = true; break;}
            message.needHealing(player);
            System.out.println("And the last one!");
            raider2.setHealth(90);
            combat.setEnemy(raider2);
            combat.attack();
            if (!player.isAlive()) {gameOver = true; break;}
            message.needHealing(player);
            System.out.println("That was a tough one! One more stop left...");
            state.levelUp(1000);
          }
        }
        strengthOfRaiders--;
        strengthOfTown++;
      }
      if (player.getPosition().equals(map.getSquare(82, 25))) {
        quest = new MainQuest("Something ends, something begins", 3000,
            "Defeat the raiders in the last battle for the Wasteland!");
        System.out.println("Here comes the last one... I am ready Ajax. I won't give up and surrender! Bring it on!");
        player.setHealth(150);
        combat.setEnemy(raiderAjax);
        combat.attack();
        if (player.isAlive()) {
          System.out.println("I got their leader! But when I was here, they attacked the town... I hope my friends were prepared...");
          strengthOfRaiders--;
          strengthOfRaiders--;
          finalS.finalBattleCheck(strengthOfTown, strengthOfRaiders, karma);
          break;
        }
        else {
          System.out.println("You got defeated by Ajax. No one can save the town now...");
          gameOver = true;
        }
      }

      // Add SecondaryQuests
      if (player.getPosition().equals(map.getSquare(53, 65))) {
        secQuest = new SecondaryQuest("Observer", 100,
            "Walk around and check if anyone needs help.");
        System.out.println("I see a body on the road, he isnt moving...");
        friendlyStories.getWoundedGuard2();
        System.in.read();
        System.out.println("Time to go.");
        state.levelUp(100);
      }
      if (player.getPosition().equals(map.getSquare(79, 116))) {
        secQuest = new SecondaryQuest("Deal with the wounded raider", 150,
            "Decide what to do with this raider scum");
        friendlyStories.getWoundedRaider();
        System.out.println("That is one of raider infiltrators. I know that he is wounded and stuff...\n" +
                "But come on, he would have done the same thing to me if I was in his place. k/s");
        input = user_input.next();
        if (input.equals("k")) {
          System.out.println("Minus one. That will make the life of the inhabitants a bit simpler.");
          strengthOfRaiders--;
          karma--;
        }
        else {
          System.out.println("He is unarmed and wounded. Maybe in another life...");
          strengthOfTown--;
          karma++;
        }
      }
      if (player.getPosition().equals(map.getSquare(42, 40))) {
        secQuest = new SecondaryQuest("Find Nasko's son", 300,
            "Look for Nasko's son. Nasko's son needs to be alive.");
        friendlyStories.getTrader1();
        System.out.println("I'll look behind the city walls then.");
        System.in.read();
        message.randomEncounters();
        message.needHealing(player);
        System.out.println("I think I can see him!");
        friendlyStories.getChildM1();
        System.out.println("Time to check my medical skills...");
        if (player.getAttributes().get(5).getAttributeValue() > 5) {
          System.out.println("Despite losing a leg, I managed to stop the bloodloss and safely return kid to the town.");
          karma++;
          karma++;
          state.levelUp(300);
        }
        else {
          System.out.println("Nothing I can do about it, I guess I'll just have to tell the news to his father...");
          state.levelUp(300);
        }
      }
      if (player.getPosition().equals(map.getSquare(62, 109))) {
      secQuest = new SecondaryQuest("Find stolen ammo", 250,
          "Find out what has happened to the ammunition.");
        System.out.println("Bar attender tells me that one of those guards could be guilty of the theft...");
        System.in.read();
        friendlyStories.getSecurity1();
        System.in.read();
        friendlyStories.getWoundedGuard();
        System.in.read();
        friendlyStories.getSecurity2();
        System.in.read();
        System.out.println("Is it Andrew or... Fuck ,how would I know, just have to consider the little facts that I have.");
        if (player.getAttributes().get(3).getAttributeValue() > 5) {
          System.out.println("I think the new guy just accidentally dropped 7.62. We don't use these bullets\n" +
                  "anywhere but in the town turret...");
        }
        System.out.println("My choice is: a/b/c");
        input = user_input.next();
        if (input.equals("a")) {
          System.out.println("I had to accuse Andrew. Theft is a theft... What a loss for the security.");
          strengthOfTown--;
          state.levelUp(250);
        }
        else if (input.equals("b")) {
          System.out.println("Accusing someone who can't defend himself is harsh, but that's life right?");
          state.levelUp(250);
        }
        else {
          System.out.println("His face says guilty. Right decision, does he deserve to live for such a crime? y/n");
          input = user_input.next();
          if (input.equals("y")) {
            System.out.println("I hope you suffer the guilt for the rest of your life you fucker...");
            karma++;
          }
          else {
            System.out.println("One less problem for the Sheriff...");
            karma--;
            strengthOfTown++;
          }
        }
      }
      if (player.getPosition().equals(map.getSquare(46, 19))) {
      secQuest = new SecondaryQuest("Find Orson", 500,
          "Find out what happened to Orson Krennik.");
        friendlyStories.getCit3();
        System.out.println("Orson was a well known ranger here. His wife asked me to find him. Or is remains...");
        message.randomEncounters();
        System.out.println("I can see this bitch Astra cutting his remains into pieces! Die you whore!");
        combat.setEnemy(raiderAstra);
        combat.attack();
        message.needHealing(player);
        friendlyStories.getWoundedRanger();
        System.out.println("Rest in peace Orson... You deserved it... Should I take his armor and weapons\n" +
                "Or respect his peace? y/n");
        input = user_input.next();
        if (input.equals("y")) {
          System.out.println("They would certainly help me in this war...");
          player.setArmor(RANGER_ARMOR);
          player.setGunInHand(Guns.HECATE);
          state.levelUp(500);
        }
        else {
          karma++;
          karma++;
          state.levelUp(500);
        }
      }
      if (player.getPosition().equals(map.getSquare(47, 80))) {
        secQuest = new SecondaryQuest("Get the chems", 300,
            "Decide whether to help Alistair with his chem request.");
        friendlyStories.getTrader1();
        System.out.println("Easy job, good payment, but does the doctor need these meds as well?");
        System.in.read();
        friendlyStories.getDocsec();
        System.out.println("Do I do it or not? y/n");
        input = user_input.next();
        if (input.equals("y")) {
          System.out.println("Everyone survives in different ways, I guess that's what I needed to do...");
          karma--;
          state.levelUp(1500);
        }
        else {
          System.out.println(" I am not that kind of person...");
          karma++;
        }
      }

      if (player.getPosition().equals(map.getSquare(71, 90))) {
        message.randomEncounters();
          System.out.println("You found a Revolver and a combat armor. Do you want to use them now? " +
                  "[y/n]");
          player.getGuns().add(Guns.REVOLVER);
          if (user_input.next().equals("y")) {
            player.setGunInHand(Guns.REVOLVER);
            player.setArmor(COMBAT_LIGHT);
          }
        }

      if (player.getPosition().equals(map.getSquare(74, 20))) {
        message.randomEncounters();
          System.out.println("You found M4. Do you want to use it now? " +
                  "[y/n]");
          player.getGuns().add(Guns.M4);
          if (user_input.next().equals("y")) {
            player.setGunInHand(Guns.M4);
          }
        }

      if (gameOver) {
        break;
      }


    }

    System.out.println("Thank you for playing! I hope you enjoyed the game!\n" +
            "Made by Irina, Codin and Dima for FacebookHack17.");
  }

}
