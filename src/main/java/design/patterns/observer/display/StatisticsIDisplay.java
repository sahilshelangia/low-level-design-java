package design.patterns.observer.display;

import design.patterns.observer.IObserver;
import design.patterns.observer.WeatherData;

public class StatisticsIDisplay implements IObserver, IDisplay {
    private int temperature, humidity, pressure;
    private WeatherData weatherData;

    public StatisticsIDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        this.pressure = this.weatherData.getPressure();

        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics display:");
    }
}
