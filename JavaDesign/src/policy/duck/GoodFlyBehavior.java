package policy.duck;

public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("--GoodFly--");
    }
}
