package policy.duck;

public class GeGeQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("--GeGeQuack--");
    }
}
