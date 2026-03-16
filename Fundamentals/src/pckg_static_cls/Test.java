package pckg_static_cls;

public class Test {
    public static void main(String[] args) {
        User us1 = new User("John", "john@gmail.com");
        us1.performSomeStudyAction();
        System.out.println(us1);
        AUX_CLS.printSomeMSG("This is good msg!");

        SuperUser sup1 = new SuperUser("Petar Spasitelj", "p.spasitelj@gmail.com", 23);
        System.out.println(sup1);
        sup1.performSomeStudyAction();
    }
}
