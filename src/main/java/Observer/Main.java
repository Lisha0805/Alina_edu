package Observer;

public class Main {
    public static void main(String[] args) {

        Chats chat = new Chats();
        //User user = new User("Юзер01", chat);
        new User("Юзер1", chat);
        new User("Юзер2", chat);
        new User("Юзер3", chat);
        chat.setMessage("Оаоаоаоа");

        //chat.removeUser(user); // не получилось реализовать
        chat.setMessage("Хоба");
    }
}
