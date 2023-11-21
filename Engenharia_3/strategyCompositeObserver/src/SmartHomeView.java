import java.util.ArrayList;
import java.util.List;

public class SmartHomeView extends NotifyerMakerController implements NotifyerController {
    private List<NotifyerMakerController> childDevices = new ArrayList<>();

    public void addChildDevice(NotifyerMakerController device) {
        childDevices.add(device);
        device.addObserver(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Composite device received update: " + message);
    }

    public void notifyChildDevices(String message) {
        for (NotifyerMakerController device : childDevices) {
            device.notifyObservers(message);
        }
    }
}