package pckg_static_cls;

public class SuperUser extends User {

    public SuperUser(String name, String email, int id) {
        super(name, email);
        this.id = id;
    }

    @Override
    public void performSomeStudyAction() {
        System.out.println("User " + name + " is performing some study action from SuperUser Class");
    }
}
