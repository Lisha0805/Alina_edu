package Adapter;

public class DiscDrive implements USB{

    private Disc disc;

    public DiscDrive(Disc disc) {
        this.disc = disc;
    }


    @Override
    public void connectWithUsbCable() {

        this.disc.insert();
        this.disc.copyData();
        this.disc.extracted();
    }
}
