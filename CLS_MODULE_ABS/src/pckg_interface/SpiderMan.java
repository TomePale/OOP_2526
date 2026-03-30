package pckg_interface;

public class SpiderMan extends Man implements Fly, RunFast{

    public SpiderMan(String name) {
        super(name);
    }

    @Override
    public void flyingAbility() {
        System.out.println("SpiderMan can fly using nets...");
    }

    @Override
    public void fastRunningAbility() {
        System.out.println("SpiderMan can run fast...");
    }
}
