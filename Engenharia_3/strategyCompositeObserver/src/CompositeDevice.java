import java.util.ArrayList;
import java.util.List;

public class CompositeDevice extends Subject implements Observer {
    private List<Subject> childDevices = new ArrayList<>();

    public void addChildDevice(Subject device) {
        childDevices.add(device);
        device.addObserver(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Composite device received update: " + message);
    }

    public void notifyChildDevices(String message) {
        for (Subject device : childDevices) {
            device.notifyObservers(message);
        }
    }
}