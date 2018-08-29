package sibintek.drondemo.entity;

public class UserData {
    private String userData;
    private boolean inHelmet;

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public boolean isInHelmet() {
        return inHelmet;
    }

    public void setInHelmet(boolean inHelmet) {
        this.inHelmet = inHelmet;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "userData='" + userData + '\'' +
                ", inHelmet=" + inHelmet +
                '}';
    }
}
