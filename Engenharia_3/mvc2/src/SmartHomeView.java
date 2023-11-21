import java.util.ArrayList;
import java.util.List;

class SmartHomeView {
    private List<Subject> childDevices = new ArrayList<>();

    public void addChildDevice(Subject device) {
        childDevices.add(device);
    }

    public void update(String message) {
System.out.println("Composite device received update: " + message);
    }

    public void notifyChildDevices(String message) {
        for (Subject childDevice : childDevices) {
            childDevice.update(message);
        }
    }
}