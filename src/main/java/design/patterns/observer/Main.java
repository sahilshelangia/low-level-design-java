package design.patterns.observer;

import design.patterns.observer.display.CurrentIDisplay;
import design.patterns.observer.display.ForecastIDisplay;
import design.patterns.observer.display.StatisticsIDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentIDisplay currentDisplay = new CurrentIDisplay(weatherData);
        ForecastIDisplay forecastDisplay = new ForecastIDisplay(weatherData);
        StatisticsIDisplay statisticsDisplay = new StatisticsIDisplay(weatherData);
        weatherData.addObserver(currentDisplay);
        weatherData.addObserver(forecastDisplay);
        weatherData.addObserver(statisticsDisplay);

        weatherData.setWeatherData(1, 1, 1);
        weatherData.setWeatherData(1, 1, 1);
    }
}
