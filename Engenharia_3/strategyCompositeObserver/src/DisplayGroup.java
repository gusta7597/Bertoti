import java.util.ArrayList;
import java.util.List;

public class DisplayGroup implements DisplayStrategy {
    private List<DisplayStrategy> displays = new ArrayList<>();

    public void addDisplay(DisplayStrategy display) {
        displays.add(display);
    }

    public void removeDisplay(DisplayStrategy display) {
        displays.remove(display);
    }

    @Override
    public void display(float temperature, float humidity) {
        for (DisplayStrategy display : displays) {
            display.display(temperature, humidity);
        }
    }
}
