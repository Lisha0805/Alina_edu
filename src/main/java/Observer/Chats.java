package Observer;
import java.util.ArrayList;
import java.util.List;

public class Chats implements ChatObservable {

    private final List<ChatObserver> observers = new ArrayList<>();
    private String message;

    @Override
    public void addObserver(ChatObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ChatObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
        System.out.println("Новое сообщение: " + message);
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (ChatObserver observer : observers)
            observer.update(message);
    }
}
