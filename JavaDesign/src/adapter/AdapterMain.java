package adapter;

public class AdapterMain {

    public static void main(String[] args) {
        Ps p1 = new ClassAdapter();
        p1.ps();

        Ps p2 = new ObjectAdapter(new Usber());
        p2.ps();

        A a = new AUse();
        a.a();
        a.c();
    }
}
