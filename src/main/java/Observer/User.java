package Observer;

public class User{

    private String name;

    public User (String name, Chats chat) {
        this.name = name;
        chat.addUser(this);
    }

    public void update(String message) {
        System.out.println(name + " прочитал: " + message);
    }
}
