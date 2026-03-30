package pckg_abs_cls;

public abstract class Device {
    protected String manufacturer;
    protected String model;
    protected int id;
    private static int cntID = 1;

    protected Device(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.id = cntID++;
    }

    public void getMainInfo() {
        System.out.println("Model: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("ID: " + id);
    }

    protected abstract void operate();

}
