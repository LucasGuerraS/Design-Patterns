package weather.app.weatherdata;

import weather.app.interfac.Observer;
import weather.app.interfac.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(weather.app.interfac.Observer o) {
        observers.add(o);
    }

    public void removeObserver(weather.app.interfac.Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;}

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    // other WeatherData methods here
}
