package Observer;
import java.util.ArrayList;
import java.util.List;

public class Chats implements ChatObserver{

    private List<User> observers = new ArrayList<>();
    private String message;

    public Chats() {
        //observers = new ArrayList<User>();
    }
    public void addUser(User user) {
        this.observers.add(user);
    }
    public void removeUser(User user) {
        this.observers.remove(user);
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println("Новое сообщение: " + message);
        notifyObservers();
    }
    @Override
    public void notifyObservers() {
        for (User user : this.observers)
            user.update(this.message);
    }
}
