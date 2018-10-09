package decorator;

public class Source implements MyInterface {
    @Override
    public void eat() {
        System.out.println("原始方法");
    }
}
