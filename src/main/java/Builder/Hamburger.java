package Builder;

public class Hamburger {
    private String bun;
    private String meat;
    private String sauce;
    private String vegetables;

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {
        return "Hamburger {" +
                "bun - " + bun +
                ", meat - " + meat +
                ", sauce - " + sauce +
                ", vegetables - " + vegetables +
                "}" ;
    }
}
