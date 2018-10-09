package proxy.staticproxy;

public class PersonProxy implements Person {

    private Teacher t;

    public PersonProxy(Teacher t){
        this.t = t;
    }

    @Override
    public void buyCar() {
        System.out.println("staticProxy");
        t.buyCar();
    }
}
