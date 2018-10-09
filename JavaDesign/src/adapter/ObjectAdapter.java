package adapter;

public class ObjectAdapter implements Ps {

    private Usb usb;

    public ObjectAdapter(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void ps() {
        usb.usb();
    }
}
