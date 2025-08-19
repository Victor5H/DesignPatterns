package headFirst.observer.observer;

import headFirst.observer.subject.Subject;
import headFirst.observer.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private final WeatherData weatherData;
    private float temperature;
    private float humidity;
    public CurrentConditionsDisplay(WeatherData weatherData){
//        passing the Subject so that it could register itself
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void stopObserving(){
        weatherData.removeObserver(this);

    }
    @Override
    public void display() {
        System.out.println("Current Temp is "+temperature+", current humidity is "+humidity);
    }

    @Override
    public void update() {
//         this method now pulls only necessary information form subject, instead of hardcoding this method with parameters
//        improving for future changes in subject data;
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        display();
    }
}
