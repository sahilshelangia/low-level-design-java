package design.patterns.observer;

public class WeatherData extends Subject {
    private int temperature, humidity, pressure;

    public WeatherData() {
        super();
    }

    public void setWeatherData(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        this.notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }
}
