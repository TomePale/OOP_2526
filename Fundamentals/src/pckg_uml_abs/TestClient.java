package pckg_uml_abs;

public class TestClient {
    public static void main(String[] args) {
        SportGpMotor mot1 = new SportGpMotor("Ducati", "H1000");

        // Tight coupling - SportCar sam kreira Driver
        // SportCar spc = new SportCar("BMW", "X5", "John");

        // Dependency Injection - Driver se kreira izvana
        Driver driver = new Driver("John");
        System.out.println("Name of the driver: " + driver.driverName);
        SportCar spc = new SportCar("BMW", "X5", driver);

        mot1.startVeh();
        mot1.stopVeh();
        mot1.vehInfo();
        mot1.changeTiers();

        System.out.println("------------");

        spc.startVeh();
        spc.stopVeh();
        spc.vehInfo();
        spc.changeTiers();
    }
}
