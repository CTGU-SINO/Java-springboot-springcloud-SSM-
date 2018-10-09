package observer;

public class WeatherData {

    private float mTemperature;

    private float mHumidity;

    private float mPressure;

    private CurrentConditions mCurrentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.mCurrentConditions = currentConditions;
    }

    public float getTemperature() {
        return mTemperature;
    }

    public float getHumidity() {
        return mHumidity;
    }

    public float getPressure() {
        return mPressure;
    }

    public void dataChange() {
        mCurrentConditions.update(getTemperature(), getHumidity(), getPressure());
    }

    public void setData(float mTemperature, float mHumidity, float mPressure) {
        this.mTemperature = mTemperature;
        this.mHumidity = mHumidity;
        this.mPressure = mPressure;
        dataChange();
    }
}
