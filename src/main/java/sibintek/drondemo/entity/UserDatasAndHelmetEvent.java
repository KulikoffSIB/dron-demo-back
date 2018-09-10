package sibintek.drondemo.entity;

import java.util.List;

public class UserDatasAndHelmetEvent {
    List<UserData> detectedPersons;
    boolean inHelmet;

    public List<UserData> getDetectedPersons() {
        return detectedPersons;
    }

    public void setDetectedPersons(List<UserData> detectedPersons) {
        this.detectedPersons = detectedPersons;
    }

    public boolean isInHelmet() {
        return inHelmet;
    }

    public void setInHelmet(boolean inHelmet) {
        this.inHelmet = inHelmet;
    }

    @Override
    public String toString() {
        return "UserDatasAndHelmetEvent{" +
                "detectedPersons=" + detectedPersons +
                ", inHelmet=" + inHelmet +
                '}';
    }
}
