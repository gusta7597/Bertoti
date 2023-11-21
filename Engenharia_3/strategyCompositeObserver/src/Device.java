public class Device extends Subject {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public void updateStatus(String status) {
        // Update the status of the device
        // ...

        // Notify observers
        notifyObservers(name + " status: " + status);
    }
}