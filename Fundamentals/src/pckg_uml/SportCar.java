package pckg_uml;

public class SportCar extends Vehicle {
    public SportCar(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting in specific way: " + this.getClass().getSimpleName() + ": " + this.vehID);
    }

    @Override
    public void stopVehicle() {
        System.out.println("Stopping in specific way: " + this.getClass().getSimpleName() + ": " + this.vehID);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                ", vehID=" + vehID +
                '}';
    }
}
