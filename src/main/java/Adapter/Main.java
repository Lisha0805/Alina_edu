package Adapter;

public class Main {
    public static void main(String[] args) {

        USB discDriver = new DiscDrive(new Disc());
        discDriver.connectWithUsbCable();

    }
}
