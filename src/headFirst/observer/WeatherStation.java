package headFirst.observer;

import headFirst.observer.observer.CurrentConditionsDisplay;
import headFirst.observer.observer.ForecastDisplay;
import headFirst.observer.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay cc = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(23.4f,80,30);
        cc.stopObserving();
        weatherData.setMeasurements(40f,34,78);

    }
}
