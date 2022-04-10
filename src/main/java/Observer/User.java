package Observer;

public class User implements ChatObserver{

    public String name;

    public User (String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " прочитал: " + message);
    }
}
