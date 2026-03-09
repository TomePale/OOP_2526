package pckg_cls_obj;

public class AppTest {
    public static void main(String[] args) {
        Student s1 = new Student("Tome", "Perica", 13);
        Student s2 = new Student("John", "Snow", 14);

        s1.subscribeToStudentService();
    }
}
