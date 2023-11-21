class DefaultMonitoringControllerInstance {
    private static DefaultMonitoringController singleInstance = null;

    public static DefaultMonitoringController getInstance() {
        if (singleInstance == null) {
            singleInstance = new DefaultMonitoringController();
        }
        return singleInstance;
    }
}