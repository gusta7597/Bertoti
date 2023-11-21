public class Main {
    public static void main(String[] args) {
        // Create devices
        Device light = new Device("Light");
        Device thermostat = new Device("Thermostat");

        // Create composite device
        CompositeDevice smartHome = new CompositeDevice();
        smartHome.addChildDevice(light);
        smartHome.addChildDevice(thermostat);

        // Create monitoring strategies
        MonitoringStrategy defaultStrategy = new DefaultMonitoringStrategy();
        MonitoringStrategy advancedStrategy = new AdvancedMonitoringStrategy();

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