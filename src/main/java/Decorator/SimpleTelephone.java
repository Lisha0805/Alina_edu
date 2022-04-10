package Decorator;

public class SimpleTelephone implements Telephone{
    @Override
    public int getMemory() {
        return 64;
    }

    @Override
    public int getVersion() {
        return 9;
    }
}
