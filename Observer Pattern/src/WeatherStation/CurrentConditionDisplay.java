package WeatherStation;

public class CurrentConditionDisplay implements Object, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;
    
     public CurrentConditionDisplay(Subject subject) {
       this.weatherData = subject;
       weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
       this.temperature = temp;
       this.humidity = humidity;
       display();
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + this.temperature + " F degrees and " + this.humidity + " % humidity");      
    }

}
