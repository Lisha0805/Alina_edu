package Builder;

public class Main {
    public static void main(String[] args){
        BuilderHamburger ordinaryBurger = new BuilderHamburger();
        ordinaryBurger.CreateNewHamburger();

        ordinaryBurger.useBun("with sesame");
        ordinaryBurger.useMeat("beef");
        ordinaryBurger.useSauce("ketchup");
        ordinaryBurger.useVegetables("cucumber");

        System.out.println(ordinaryBurger.getHamburger().toString());
    }
}
