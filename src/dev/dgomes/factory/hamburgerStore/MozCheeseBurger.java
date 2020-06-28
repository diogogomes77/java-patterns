package dev.dgomes.factory.hamburgerStore;

public class MozCheeseBurger extends Hamburger {
    public MozCheeseBurger() {
        name = "MozCheeseBurger";
        sauce = "Sweet sauce";
        box = "Pastic box";
    }

    @Override
    public void deliver() {
        System.out.println("delivering MozCheeseBurger");
    }
}
