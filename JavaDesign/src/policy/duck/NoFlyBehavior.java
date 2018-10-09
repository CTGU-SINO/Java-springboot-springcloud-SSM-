package policy.duck;

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("--NoFly--");
    }
}
