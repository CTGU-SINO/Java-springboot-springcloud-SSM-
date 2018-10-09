package AI;

public class Model {

    public Net net;

    public String modelName;

    public String modelPath;

    public SessionConfig sessionConfig;

    public Model(Net net, String modelName, String modelPath, SessionConfig sessionConfig) {
        this.net = net;
        this.modelName = modelName;
        this.modelPath = modelPath;
        this.sessionConfig = sessionConfig;
    }

    public Net getNet() {
        return net;
    }

    public void setNet(Net net) {
        this.net = net;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelPath() {
        return modelPath;
    }

    public void setModelPath(String modelPath) {
        this.modelPath = modelPath;
    }

    public SessionConfig getSessionConfig() {
        return sessionConfig;
    }

    public void setSessionConfig(SessionConfig sessionConfig) {
        this.sessionConfig = sessionConfig;
    }

    @Override
    public String toString() {
        return "Model{" +
                "net=" + net +
                ", modelName='" + modelName + '\'' +
                ", modelPath='" + modelPath + '\'' +
                ", sessionConfig=" + sessionConfig +
                '}';
    }

    public void predict(){
        this.sessionConfig.setSessionStatus(false);
    }

    public boolean checkSessionStatus(){
        return this.sessionConfig.sessionStatus;
    }
}
