package policy.duck;

public class DuckMain {

    public static void main(String[] args) {
        Duck mGreenHeadDuck = new GreenHeadDuck();
        mGreenHeadDuck.display();
        mGreenHeadDuck.swim();
        mGreenHeadDuck.fly();
        mGreenHeadDuck.quack();
    }
}
