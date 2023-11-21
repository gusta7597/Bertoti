public class DeviceModel extends NotifyerMakerController {
    private String name;

    public DeviceModel(String name) {
        this.name = name;
    }

    public void updateStatus(String status) {
        notifyObservers(name + " status: " + status);
    }
}