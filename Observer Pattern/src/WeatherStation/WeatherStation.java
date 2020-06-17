package WeatherStation;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        
        weatherData.setMeasumentChanged(80, 65, 30.4f);
        weatherData.setMeasumentChanged(86, 67, 45); 
        weatherData.setMeasumentChanged(40, 30, 50);
        
       

    }

}
