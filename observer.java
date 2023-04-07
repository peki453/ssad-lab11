public class WeatherStation {
    private float temperature;
    private float humidity;
    private float pressure;

    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }
}

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.setWeatherData(25.5f, 75f, 1013.25f);
    }
}