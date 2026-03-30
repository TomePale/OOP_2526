package pckg_abs_cls;

public class Camera extends Device {
    public Camera(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    protected void operate() {
        System.out.printf(this.getClass().getSimpleName() + " operates as normal camera does!\n");
    }


}
