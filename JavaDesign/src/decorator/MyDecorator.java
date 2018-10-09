package decorator;

public class MyDecorator implements MyInterface {

    private MyInterface myInterface;

    public MyDecorator(MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    @Override
    public void eat() {
        before();
        myInterface.eat();
        after();
    }

    private void before(){
        System.out.println("before");
    }

    private void after(){
        System.out.println("after");
    }
}
