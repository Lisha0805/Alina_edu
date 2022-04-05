package Decorator;

public class RoomyTelephone implements Telephone{
    private Telephone telephone;

    public RoomyTelephone(Telephone telephone){
        this.telephone = telephone;
    }
    @Override
    public int getMemory() {
        return this.telephone.getMemory() + 64;
    }

    @Override
    public int getVersion() {
        return this.telephone.getVersion();
    }
}
