package sibintek.drondemo.entity;

public class UserData {
    private String name;
    private String lastname;
    private String midname;
    private String company;
    private String post;
    private boolean inHelmet;

    public String getName() {
        return name;
    }

    public UserData setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public UserData setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public String getMidname() {
        return midname;
    }

    public UserData setMidname(String midname) {
        this.midname = midname;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public UserData setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getPost() {
        return post;
    }

    public UserData setPost(String post) {
        this.post = post;
        return this;

    }

    public boolean isInHelmet() {
        return inHelmet;
    }

    public UserData setInHelmet(boolean inHelmet) {
        this.inHelmet = inHelmet;
        return this;
    }
}
