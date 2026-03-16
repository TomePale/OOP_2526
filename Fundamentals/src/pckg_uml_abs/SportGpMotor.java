package pckg_uml_abs;

public class SportGpMotor extends VehCommon {
    public SportGpMotor(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void startVeh() {
        System.out.println("SportGpMotor starting..." +this.getClass().getSimpleName() + " - " + this.id);
    }

    @Override
    public void stopVeh() {
        System.out.println("SportGpMotor stopping..." +this.getClass().getSimpleName() + " - " + this.id);
    }

    @Override
    public void vehInfo() {
        System.out.println(this.toString());
    }

    @Override
    protected void changeTiers() {
        System.out.println("SportGpMotor changing 2 tiers..." +this.getClass().getSimpleName() + " - " + this.id);
    }
}
