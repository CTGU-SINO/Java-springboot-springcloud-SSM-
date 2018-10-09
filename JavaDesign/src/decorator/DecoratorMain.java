package decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Source source = new Source();
        MyDecorator myDecorator = new MyDecorator(source);
        myDecorator.eat();
    }
}
