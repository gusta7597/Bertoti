public class DefaultMonitoringController implements MonitoringController {
    @Override
    public void performMonitoring() {
        System.out.println("Performing default monitoring strategy");
    }
}