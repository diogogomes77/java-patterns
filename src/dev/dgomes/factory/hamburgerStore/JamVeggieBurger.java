package dev.dgomes.factory.hamburgerStore;

public class JamVeggieBurger extends Hamburger {

    public JamVeggieBurger() {
        name = "JamVeggieBurger";
        sauce = "Spicy sauce";
        box = "Card box";
    }

    @Override
    public void deliver() {
        System.out.println("delivering JamVeggieBurger");
    }
}
