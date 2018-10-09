package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData1 implements Subject{

    private float mTemperature;

    private float mHumidity;

    private float mPressure;

    private List<Observer> mObservers = new ArrayList<>();

    public WeatherData1() {
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
        notifyObserver();
    }

    public void setData(float mTemperature, float mHumidity, float mPressure) {
        this.mTemperature = mTemperature;
        this.mHumidity = mHumidity;
        this.mPressure = mPressure;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        mObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(mObservers.contains(o)){
            mObservers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : mObservers){
            observer.update(getTemperature(), getHumidity(), getPressure());
        }
    }
}
