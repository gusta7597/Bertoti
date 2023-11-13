import java.util.ArrayList;
import java.util.List;

class Shop implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private boolean hasDiscount = false;

    public void setDiscountAvailable() {
        this.hasDiscount = true;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        String message = "New discounts available!";
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
