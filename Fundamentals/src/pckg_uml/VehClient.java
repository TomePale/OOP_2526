package pckg_uml;

public class VehClient {
    private static Vehicle veh;
    private static SportCar sc1;
    private static SportCar sc2;

    public static void main(String[] args) {
        veh = new Vehicle("Mazda", "CX-5");
        sc1 = new SportCar("BMW", "X4");
        sc2 = new SportCar("Audi", "A4");

        veh.startVehicle();
        veh.setDate("23-11-2008");
        veh.vehInfo();

        sc1.setDate("23-11-2008");
        sc1.vehInfo();
        sc1.startVehicle();

        sc2.setDate("01-11-2023");
        sc2.vehInfo();
        sc2.startVehicle();
    }
}
