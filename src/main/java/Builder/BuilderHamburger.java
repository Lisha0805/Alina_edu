package Builder;

public class BuilderHamburger {

    public Hamburger hamburger;

    public void CreateNewHamburger(){
        hamburger = new Hamburger();
    }

    public void useBun(String bun){
        hamburger.setBun(bun);
    }

    public void useMeat(String meat){
        hamburger.setMeat(meat);
    }

    public void useSauce(String sauce){
        hamburger.setSauce(sauce);
    }

    public void useVegetables(String vegetables){
        hamburger.setVegetables(vegetables);
    }

    public Hamburger getHamburger() {
        return hamburger;
    }
}
