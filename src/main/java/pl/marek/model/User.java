package pl.marek.model;

public class User {
    private String name;
    private String password;
    private Access access;

    public User(String name, String password, Access access) {
        this.name = name;
        this.password = password;
        this.access = access;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

}
