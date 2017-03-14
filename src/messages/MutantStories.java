package messages;

/**
 * Created by dimarammfire on 14.03.17.
 */
public class MutantStories {

    private String nukeDogs;
    private String altVargs;
    private String controllers;
    private String trappers;

    public MutantStories() {
    }

    public String getNukeDogs() {
        nukeDogs = "Nuke-dogs is a new mutated type of dogs in the wasteland. They fear nothing,\n" +
                "are always hungry and their jaws can rip apart some thick sheets of iron. Beware, hunt in packs!";
        return nukeDogs;
    }

    public String getAltVargs() {
        altVargs = "Warghogs - evilest motherfuckers this side of the Atlantic. A hybrid of\n" +
                "a wolf and a bear. Uses its monstrous clothes to rip concrete apart. Very dangerous and hard to kill.";
        return altVargs;
    }

    public String getControllers() {
        controllers = "Never attack themselves, act as a compas to other mutants. If spotted, an easy target. But that's tough.\n" +
                "If you don't do it in time, you are a dead man.";
        return controllers;
    }

    public String getTrappers() {
        trappers = "Attack from nowhere. Always attack first, not hard to kill at all. Hard to survive until the point where\n" +
                "you even have a chance to kill them...";
        return trappers;
    }
}
