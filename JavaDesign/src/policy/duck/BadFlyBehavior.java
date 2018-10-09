package policy.duck;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("--BadFly--");
    }
}
