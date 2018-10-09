package policy.duck;

public class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("--NoQuack--");
    }
}
