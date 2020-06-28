package dev.dgomes.factory.hamburgerStore;

public class JamCheeseBurger extends Hamburger {
    public JamCheeseBurger() {
        name = "JamCheeseBurger";
        sauce = "Spicy sauce";
        box = "Card box";
    }

    @Override
    public void deliver() {
        System.out.println("delivering JamCheeseBurger");
    }
}
