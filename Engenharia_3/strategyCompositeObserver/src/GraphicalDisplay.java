public class GraphicalDisplay implements DisplayStrategy {
    @Override
    public void display(float temperature, float humidity) {
        System.out.println("Graphical Display - Temperature: " + temperature + "°C, Humidity: " + humidity + "%");
    }
}