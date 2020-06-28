package dev.dgomes.factory.hamburgerStore;

public class VeggieBurger extends Hamburger {
    @Override
    void prepare() {
        System.out.println("preparing VeggieBurger");
    }

    @Override
    void cook() {
        System.out.println("cooking VeggieBurger");
    }

    @Override
    void box() {
        System.out.println("boxing VeggieBurger");
    }

    @Override
    public void deliver() {
        System.out.println("delivering VeggieBurger");
    }
}
