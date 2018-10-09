package observer;

public class CurrentConditions2 implements Observer {

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
        System.out.println("---Tomorrow mTemperature:" + (mTemperature + Math.random()) + "---");
        System.out.println("---Tomorrow mHumidity:" + (mHumidity + Math.random()) + "---");
        System.out.println("---Tomorrow mPressure:" + (mPressure + Math.random()) + "---");
    }
}
