package Observer;

public interface ChatObservable {
    void addObserver(ChatObserver user);
    void removeObserver(ChatObserver user);
    void notifyObservers();
    void setMessage(String message);
}
