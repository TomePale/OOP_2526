package pckg_uml_abs;

public class SportCar extends VehCommon {

    protected Driver driver;

    // Tight coupling - SportCar sam kreira Driver objekt
//    public SportCar(String brand, String model, String driverName) {
//        super(brand, model);
//        this.driver = new Driver(driverName);
//    }

    // Dependency Injection - Driver se kreira izvana i ubacuje kroz konstruktor
     public SportCar(String brand, String model, Driver driver) {
         super(brand, model);
         this.driver = driver;
     }

    @Override
    protected void changeTiers() {
        System.out.println("SportCar changing 4 tiers..." + this.getClass().getSimpleName() + " - " + this.id);
    }

    @Override
    public void startVeh() {
        System.out.println("SportCar starting..." + this.getClass().getSimpleName() + " - " + this.id);
    }

    @Override
    public void stopVeh() {
        System.out.println("SportCar stopping..." + this.getClass().getSimpleName() + " - " + this.id);
    }

    @Override
    public void vehInfo() {
        System.out.println(this.toString());
    }
}
