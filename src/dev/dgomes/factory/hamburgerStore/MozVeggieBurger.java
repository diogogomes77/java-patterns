package dev.dgomes.factory.hamburgerStore;

public class MozVeggieBurger extends Hamburger {

    public MozVeggieBurger() {
        name = "MozVeggieBurger";
        sauce = "Sweet sauce";
        box = "Pastic box";
    }

    @Override
    public void deliver() {
        System.out.println("delivering MozVeggieBurger");
    }
}
