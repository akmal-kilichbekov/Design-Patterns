package WeatherStation;

public class ForecastDisplay implements Object, DisplayElement {
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject subject) {
        this.weatherData = subject;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        if (humidity > 50) {
            System.out.println("Watch out !!!");
        } else if (humidity < 50) {
            System.out.println("It is okay !!!");
        }
    }

}
