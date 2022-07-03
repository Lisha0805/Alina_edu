package Observer;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Chats implements ChatObservable {

    private final List<ChatObserver> observers = new ArrayList<>();
    private String message;
    private static final Logger log = Logger.getLogger(Chats.class);

    public List<ChatObserver> getObservers() {
        return observers;
    }

    @Override
    public void addObserver(ChatObserver observer) {
        observers.add(observer);
        log.info("Добавление пользователя");
    }

    @Override
    public void removeObserver(ChatObserver observer) {
        observers.remove(observer);
        log.info("Удаление пользователя");
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
        System.out.println("Новое сообщение: " + message);
        log.info("Получено сообщение: " + message);
        notifyObservers();
        log.info("Пользователи уведомлены о новом сообщении");
    }

    @Override
    public void notifyObservers() {
        for (ChatObserver observer : observers)
            observer.update(message);
    }
}
