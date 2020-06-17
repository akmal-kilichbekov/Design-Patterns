package WeatherStation;

public class StatisticsDisplay implements Object, DisplayElement {
    private float temperature;
    private Subject weatherData;

    public StatisticsDisplay(Subject subject) {
        this.weatherData = subject;
        this.weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Avg/Max/Min: " + this.temperature);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;      
        display();
    }

}
