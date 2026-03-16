package pckg_uml_abs;

public class SportGpMotor implements Veh {

    private String brand;
    private String model;
    private int id;
    private static int cntID = 35;

    public SportGpMotor(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.id = cntID++;
    }

    @Override
    public void startVeh() {
        System.out.println("GP Motor starting..." + this.model);
    }

    @Override
    public void stopVeh() {
        System.out.println("GP Motor stopping..." + this.model);
    }

    @Override
    public String toString() {
        return "SportGpMotor{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public void vehInfo() {
        System.out.println(this.toString());
    }
}
