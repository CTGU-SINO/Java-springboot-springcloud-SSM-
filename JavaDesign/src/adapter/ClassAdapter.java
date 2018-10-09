package adapter;

public class ClassAdapter extends Usber implements Ps {
    @Override
    public void ps() {
        usb();
    }
}
