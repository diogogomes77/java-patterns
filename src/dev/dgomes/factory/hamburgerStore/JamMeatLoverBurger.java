package dev.dgomes.factory.hamburgerStore;

public class JamMeatLoverBurger extends Hamburger {
    public JamMeatLoverBurger() {
        name = "JamMeatLoverBurger";
        sauce = "Spicy sauce";
        box = "Card box";
    }

    @Override
    public void deliver() {
        System.out.println("delivering JamMeatLoverBurger");
    }
}
