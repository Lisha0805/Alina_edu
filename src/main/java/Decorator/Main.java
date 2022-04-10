package Decorator;

public class Main {
    public static void main(String[] args) {
        Telephone simpleTelephone = new SimpleTelephone();
        System.out.println("Версия обычного телефона: " + String.valueOf(simpleTelephone.getVersion()));
        System.out.println("Количество памяти в обычном телефоне: " + String.valueOf(simpleTelephone.getMemory()));

        Telephone modernTelephone = new ModernTelephone(simpleTelephone);
        System.out.println("Версия современного телефона: " + String.valueOf(modernTelephone.getVersion()));
        System.out.println("Количество памяти в современном телефоне: " + String.valueOf(modernTelephone.getMemory()));

        Telephone roomyTelephone = new RoomyTelephone(simpleTelephone);
        System.out.println("Версия вместительного телефона: " + String.valueOf(roomyTelephone.getVersion()));
        System.out.println("Количество памяти во вместительном телефоне: " + String.valueOf(roomyTelephone.getMemory()));
    }
}
