public class TextDisplay implements DisplayStrategy {
    @Override
    public void display(float temperature, float humidity) {
        System.out.println("Text Display - Temperature: " + temperature + "°C, Humidity: " + humidity + "%");
    }
}
