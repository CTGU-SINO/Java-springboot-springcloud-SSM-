package observer;

public class CurrentConditions {

    private float mTemperature;

    private float mHumidity;

    private float mPressure;

    public void update(float mTemperature, float mHumidity, float mPressure) {
        this.mTemperature = mTemperature;
        this.mHumidity = mHumidity;
        this.mPressure = mPressure;
        display();
    }

    public void display() {
        System.out.println("---Today mTemperature:" + mTemperature + "---");
        System.out.println("---Today mHumidity:" + mHumidity + "---");
        System.out.println("---Today mPressure:" + mPressure + "---");
    }
}
