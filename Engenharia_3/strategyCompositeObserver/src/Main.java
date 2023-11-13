public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        TextDisplay textDisplay = new TextDisplay();
        GraphicalDisplay graphicalDisplay = new GraphicalDisplay();

        DisplayGroup displayGroup = new DisplayGroup();
        displayGroup.addDisplay(textDisplay);
        displayGroup.addDisplay(graphicalDisplay);

        // Simulando a mudança nos dados meteorológicos
        weatherData.setMeasurements(25.5f, 60.0f);
    }
}
