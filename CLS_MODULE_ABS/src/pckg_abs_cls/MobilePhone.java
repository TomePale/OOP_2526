package pckg_abs_cls;

public class MobilePhone extends Device {

    protected MobilePhone(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    protected void operate() {
        System.out.printf(this.getClass().getSimpleName() + " operates as normal mobile phones does!\n");
    }
}
