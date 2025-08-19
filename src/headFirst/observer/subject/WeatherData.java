package headFirst.observer.subject;

import headFirst.observer.observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:observers){
            observer.update();
        }
    }
    public void measurementsChanged(){
        notifyObserver();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
