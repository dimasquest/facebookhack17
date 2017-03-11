package messages;

import Characters.Character;

/**
 * Created by dimarammfire on 11.03.17.
 */
public class FriendlyStories extends NPCStories {

    private String sheriff;
    private String docsec;
    private String mayor;
    private String trader1;
    private String trader2;
    private String childM;
    private String childM1;
    private String childM2;
    private String childF;
    private String childF1;
    private String childF2;
    private String security;
    private String security1;
    private String security2;
    private String woundedGuard;
    private String woundedGuard2;
    private String woundedRanger;
    private String woundedRaider;
    private String cit;
    private String cit2;
    private String cit3;

    public void getSheriff() {
        sheriff = "Tall man in his 50s with a S&W on his hip and a 1887 behind the back. The most honest man in the wasteland\n" +
                "and you ought to be in good relationship with him. Or trouble.";
        System.out.println(sheriff);
    }

    public void getDocsec() {
        docsec = "Ms O'Hara - the ideal representation of the military doctor. Hard-working, commited and not scared of death.\n" +
                "The exact type of person this town needs. Helps Castello to treat the injuries.";
        System.out.println(docsec);
    }

    public void getMayor() {
        if (1 == 0) {
            mayor = "Dishonest prick who deserves to die. The entire reason this raider conflict happened in the first place.";
        }
        else {
            mayor = "Old man in his 70s, he has ruled the town for the past 15 years. Despite being a wise and experienced man, I beleive \n" +
                    "that he is hiding something. I'm yet to discover what.";
        }
    }

    public void getTrader1() {
        trader1 = "Nasko, local gunsmith. Apparently he has lost his son recently. Worths investigating.";
        System.out.println(trader1);
    }

    public void getTrader2() {
        trader2 = "Alistair is a local chem dealer. He claims that it is all legal, but I wouldn't be so sure.\n" +
                "People like him are very likely to have some job to give. If I don't mind getting my hands dirty.";
        System.out.println(trader2);
    }

    public void getChildM() {
        childM = "Just a kid running around. He looks a tiny bit suspicious...";
        System.out.println(childM);
    }

    public void getChildM1() {
        childM1 = "Oh goodness! That looks like Nasko's son! The problem is that he only has one leg. Fuck me, that\n" +
                "must have been a trip mine. Poor kid, maybe I can still help him.";
        System.out.println(childM1);
    }

    public void getChildM2() {
        childM2 = "Mayor's son. Maybe he somehow overheard what his dad was talking about with this raider scum?";
        System.out.println(childM2);
    }

    public void getChildF() {
        childF = "I feel like I've seen this girl before. Can't remember where though...";
        System.out.println(childF);
    }

    public void getChildF1() {
        childF1 = "This girl seems to be in an agony. There is nothing I can do to help her. Actually...";
        System.out.println(childF1);
    }

    public void getChildF2() {
        childF2 = "Please don't do it. If she runs away, they will be aware of my presence. Should I?";
        System.out.println(childF2);
    }

    public void getSecurity() {
        security = "Jeff, the guard. Very enthusiastic young man, who isnt careful enough with his gun\n" +
                "last time he accidentally shot the sheriff. Moron.";
        System.out.println(security);
    }

    public void getSecurity1() {
        security1 = "Andrew is a very experienced soldier. Ex-captain of the Navy SEALs. Tough as nails, commited as no one else.\n" +
                "Best companion to have on your side.";
        System.out.println(security1);
    }

    public void getSecurity2() {
        security2 = "That's a new guy. I think he is called James. Not sure where he comes from. Seems to be an ok guy.";
        System.out.println(security2);
    }

    public void getWoundedGuard() {
        woundedGuard = "David. Hero. Covered the mayor from the raider last month, still hasnt recovered. He seems to be better than\n" +
                "when I last saw him.";
        System.out.println(woundedGuard);
    }

    public void getWoundedGuard2() {
        woundedGuard2 = "I don't even know his name. There seems to be very little I could do for him.";
        System.out.println(woundedGuard2);
    }

    public void getWoundedRanger() {
        woundedRanger = "Orson Krennik, 43 years old. Legend of the wasteland, now lying here unconcious with a hole\n" +
                "in his liver. Only a specialist could help him now.";
        System.out.println(woundedRanger);
    }

    public void getWoundedRaider() {
        woundedRaider = "Don't have a clue why didn't the guards finish him. I could do that for them though...";
        System.out.println(woundedRaider);
    }

    public void getCit() {
        cit = "Pablo is a local farmer. Surpriced his house is still standing after the entire raider madness.";
        System.out.println(cit);
    }

    public void getCit2() {
        cit2 = "That is the guy who let them into the town! I can catch him or run and stop the fire. Fucking hell...";
        System.out.println(cit2);
    }

    public void getCit3() {
        cit3 = "Sandra is Orson's wife. I hope she will be ok after hearing what happened to him...";
        System.out.println(cit3);
    }

    public FriendlyStories() {
    }

}
