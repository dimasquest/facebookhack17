package decisions;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class FinalDecisions {

    public boolean finalBattleCheck(int strengthOfTheTown, int raiderStrength, int karma) {
        if (strengthOfTheTown > raiderStrength) {
            System.out.println("You were victorious, the town is saved.");
            if (karma > 0) {
                System.out.println("That doesn't, however, mean that you are a hero.\n" +
                        "The amount of innocent blood that you have spilled outnumbers any lives that you have saved.\n" +
                        "Wasteland is lucky to have another town saved, but yet unlucky to have another monster born...");
                return true;
            }
            else {
                System.out.println("The town managed to survive. You managed to stay a human. In a harsh world like this one,\n" +
                        "this means a lot. You are a person of inner strength and high moral standards. Well done!");
                return true;
            }
        }
        else {
            System.out.println("The town is in ruins. Raiders managed to destroy the town hall. All hope is lost...");
            return true;
        }
    }
}
