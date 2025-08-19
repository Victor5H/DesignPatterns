package headFirst.observer.observer;

import headFirst.observer.subject.WeatherData;

public class ForecastDisplay implements Observer,DisplayElement{
    private final WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        humidity = (float) (humidity-0.2);
        System.out.println("Forecasting weather: Temperature "+temperature+1+" humidity: "+humidity+" pressure "+pressure);
    }

    @Override
    public void update() {
//        this method now pulls only necessary information form subject, instead of hardcoding this method with parameters
//        improving for future changes in subject data;
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        pressure = weatherData.getPressure();
        display();
    }
}
