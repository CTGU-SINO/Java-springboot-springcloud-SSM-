package proxy.staticproxy;

public class Main {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        PersonProxy proxy = new PersonProxy(t);
        proxy.buyCar();
    }
}
