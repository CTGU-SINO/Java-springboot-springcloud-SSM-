package AI;

public class SessionConfig {

    public String GPUName;

    public Integer GPUNumber;

    public boolean sessionStatus;

    public SessionConfig(String GPUName, Integer GPUNumber) {
        this.GPUName = GPUName;
        this.GPUNumber = GPUNumber;
        this.sessionStatus = true;
    }

    public SessionConfig(String GPUName, Integer GPUNumber, boolean sessionStatus) {
        this.GPUName = GPUName;
        this.GPUNumber = GPUNumber;
        this.sessionStatus = sessionStatus;
    }

    public String getGPUName() {
        return GPUName;
    }

    public void setGPUName(String GPUName) {
        this.GPUName = GPUName;
    }

    public Integer getGPUNumber() {
        return GPUNumber;
    }

    public void setGPUNumber(Integer GPUNumber) {
        this.GPUNumber = GPUNumber;
    }

    public boolean isSessionStatus() {
        return sessionStatus;
    }

    public void setSessionStatus(boolean sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    @Override
    public String toString() {
        return "SessionConfig{" +
                "GPUName='" + GPUName + '\'' +
                ", GPUNumber=" + GPUNumber +
                ", sessionStatus=" + sessionStatus +
                '}';
    }
}
