package pckg_abs_cls;

public class TestDeviceApp {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("Samsung", "S26");
        mobilePhone.operate();
        mobilePhone.getMainInfo();

        System.out.println("========");

        Device camera = new Camera("Canon", "5D Mark IV");
        camera.operate();
        camera.getMainInfo();
    }
}