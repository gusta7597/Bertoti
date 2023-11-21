import java.util.ArrayList;
import java.util.List;

class NotifyMakerController {
    private List<NotifyController> observers = new ArrayList<>();

    public void addObserver(NotifyController observer) {
        observers.add(observer);
    }

    public void removeObserver(NotifyController observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (NotifyController observer : observers) {
            observer.update(message);
        }
    }
}
