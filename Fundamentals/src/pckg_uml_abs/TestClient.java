package pckg_uml_abs;

public class TestClient {
    public static void main(String[] args) {
        SportGpMotor mot1 = new SportGpMotor("Ducati", "H1000");
        SportCar spc = new SportCar("BMW", "X5");
        mot1.startVeh();
        mot1.stopVeh();
        mot1.vehInfo();
        System.out.println("------------");
        spc.startVeh();
        spc.stopVeh();
        spc.vehInfo();
    }
}
