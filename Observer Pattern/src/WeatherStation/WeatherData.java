package WeatherStation;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Object> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData() {
      observers = new ArrayList<Object>();
    }

    @Override
    public void registerObserver(Object o) {
       observers.add(o);        
    }

    @Override
    public void unRegisterObserver(Object o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);        
        }        
    }

    @Override
    public void notifyChanges() {
        for (int i = 0; i < observers.size(); i++) {
            Object object = observers.get(i);
            object.update(temperature, humidity, pressure);
        }        
    }
    
    public void measurementChanged() {
        notifyChanges();
    }
    
    public void setMeasumentChanged(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();        
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

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    
    

}
