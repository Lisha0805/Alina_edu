package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("singleton");
        Singleton anotherSingleton = Singleton.getInstance("anotherSingleton");

        System.out.println(singleton.text);
        System.out.println(anotherSingleton.text);
    }
}
