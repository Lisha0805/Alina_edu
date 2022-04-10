package Observer;

public class Main {
    public static void main(String[] args) {

        ChatObservable chat = new Chats();
        ChatObserver userFirst = new User("Юзер1");
        chat.addObserver(userFirst);

        chat.addObserver(new User("Юзер2"));
        chat.addObserver(new User("Юзер3"));
        chat.setMessage("Оаоаоаоа");

        chat.removeObserver(userFirst);
        chat.setMessage("Хоба");
    }
}
