package exercices;

public class Wilder {

    private String firstName;
    private boolean aware;

    public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    public String whoAmI() {

        String txt = "Je m'appelle " + firstName + " et je ";
        txt += aware ? "suis " : "ne suis pas ";
        txt += "aware";

        return txt;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }
}