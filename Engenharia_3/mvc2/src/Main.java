public class Main {
    public static void main(String[] args) {
        // Create devices
        DeviceModel light = new Device("Light");
        DeviceModel thermostat = new Device("Thermostat");

        // Create composite device
        SmartHomeView smartHome = new SmartHomeView();
        smartHome.addChildDevice(light);
        smartHome.addChildDevice(thermostat);

        // Create monitoring strategies
        MonitoringController defaultStrategy = new DefaultMonitoringController();
        MonitoringController advancedStrategy = new AdvancedMonitoringController();

        // Set monitoring strategy for devices
        light.addObserver(defaultStrategy::performMonitoring);
        thermostat.addObserver(advancedStrategy::performMonitoring);

        // Simulate device status update
        light.updateStatus("On");
        thermostat.updateStatus("Cooling");

        // Notify composite device and its child devices
        smartHome.notifyChildDevices("Emergency alert!");

    }
}