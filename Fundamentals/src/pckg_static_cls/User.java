package pckg_static_cls;

public class User {
    protected String name;
    protected String email;
    private static int cntID = 100;

    private static final int MAX_VAL = 200;

    protected int id;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = cntID++;
    }

    public void performSomeStudyAction() {
        System.out.println("User " + name + " is performing some study action");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
