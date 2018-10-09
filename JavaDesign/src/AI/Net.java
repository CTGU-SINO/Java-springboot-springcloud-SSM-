package AI;

public class Net {

    public String conv2dLayer;

    public String maxPooling;

    public String fullyLayer;

    public Net(String conv2dLayer, String maxPooling, String fullyLayer) {
        this.conv2dLayer = conv2dLayer;
        this.maxPooling = maxPooling;
        this.fullyLayer = fullyLayer;
    }

    public String getConv2dLayer() {
        return conv2dLayer;
    }

    public void setConv2dLayer(String conv2dLayer) {
        this.conv2dLayer = conv2dLayer;
    }

    public String getMaxPooling() {
        return maxPooling;
    }

    public void setMaxPooling(String maxPooling) {
        this.maxPooling = maxPooling;
    }

    public String getFullyLayer() {
        return fullyLayer;
    }

    public void setFullyLayer(String fullyLayer) {
        this.fullyLayer = fullyLayer;
    }

    @Override
    public String toString() {
        return "Net{" +
                "conv2dLayer='" + conv2dLayer + '\'' +
                ", maxPooling='" + maxPooling + '\'' +
                ", fullyLayer='" + fullyLayer + '\'' +
                '}';
    }
}
