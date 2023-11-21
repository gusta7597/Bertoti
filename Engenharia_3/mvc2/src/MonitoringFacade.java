class MonitoringFacade {
    private MonitoringController controller;

    public MonitoringFacade(MonitoringController controller) {
        this.controller = controller;
    }

    public void startMonitoring() {
        controller.performMonitoring();
    }

    public void stopMonitoring() {
        // ...
    }
}