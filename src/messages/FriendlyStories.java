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

    public String getTrader1() {
        return trader1;
    }

    public String getTrader2() {
        return trader2;
    }

    public String getChildM() {
        return childM;
    }

    public String getChildM1() {
        return childM1;
    }

    public String getChildM2() {
        return childM2;
    }

    public String getChildF() {
        return childF;
    }

    public String getChildF1() {
        return childF1;
    }

    public String getChildF2() {
        return childF2;
    }

    public String getSecurity() {
        return security;
    }

    public String getSecurity1() {
        return security1;
    }

    public String getSecurity2() {
        return security2;
    }

    public String getWoundedGuard() {
        return woundedGuard;
    }

    public String getWoundedGuard2() {
        return woundedGuard2;
    }

    public String getWoundedRanger() {
        return woundedRanger;
    }

    public String getWoundedRaider() {
        return woundedRaider;
    }

    public String getCit() {
        return cit;
    }

    public String getCit2() {
        return cit2;
    }

    public String getCit3() {
        return cit3;
    }

    public FriendlyStories() {
    }

}
