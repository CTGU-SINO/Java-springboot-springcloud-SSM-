package observer;

public class ObserverMain {

    public static void main(String[] args) {
//        CurrentConditions mCurrentConditions;
//        WeatherData mWeatherData;
//
//        mCurrentConditions = new CurrentConditions();
//        mWeatherData = new WeatherData(mCurrentConditions);
//
//        mWeatherData.setData(30,40,50);

        CurrentConditions1 mCurrentConditions1;
        CurrentConditions2 mCurrentConditions2;
        WeatherData1 mWeatherData1;

        mCurrentConditions1 = new CurrentConditions1();
        mCurrentConditions2 = new CurrentConditions2();
        mWeatherData1 = new WeatherData1();
        mWeatherData1.registerObserver(mCurrentConditions1);
        mWeatherData1.registerObserver(mCurrentConditions2);
        mWeatherData1.setData(30,40,50);
        mWeatherData1.removeObserver(mCurrentConditions2);
        mWeatherData1.setData(40,30,50);
    }
}
