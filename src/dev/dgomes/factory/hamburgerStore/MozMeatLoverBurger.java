package dev.dgomes.factory.hamburgerStore;

public class MozMeatLoverBurger extends Hamburger {
    public MozMeatLoverBurger() {
        name = "MozMeatLoverBurger";
        sauce = "Sweet sauce";
        box = "Pastic box";
    }

    @Override
    public void deliver() {
        System.out.println("delivering MozMeatLoverBurger");
    }
}
