import java.util.ArrayList;
import java.util.List;

public class NotifyerMakerController {
    private List<NotifyerController> observers = new ArrayList<>();

    public void addObserver(NotifyerController observer) {
        observers.add(observer);
    }

    public void removeObserver(NotifyerController observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (NotifyerController observer : observers) {
            observer.update(message);
        }
    }
}