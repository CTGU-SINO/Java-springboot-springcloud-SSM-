package proxy.dynamicproxy;

public class Main {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        PersonProxy personProxy = new PersonProxy(t);
        Person person = (Person) personProxy.createProxy();
        person.buyCar();
    }
}
