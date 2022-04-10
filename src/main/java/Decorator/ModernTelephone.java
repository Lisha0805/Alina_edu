package Decorator;

public class ModernTelephone implements Telephone{

    private final Telephone telephone;
    public ModernTelephone(Telephone telephone){
        this.telephone = telephone;
    }

    @Override
    public int getMemory() {
        return this.telephone.getMemory();
    }

    @Override
    public int getVersion() {
        return this.telephone.getVersion() + 1;
    }
}
