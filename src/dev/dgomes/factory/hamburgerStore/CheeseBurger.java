package dev.dgomes.factory.hamburgerStore;

public class CheeseBurger extends Hamburger {
    @Override
    void prepare() {
        System.out.println("preparing CheeseBurger");
    }

    @Override
    void cook() {
        System.out.println("cooking CheeseBurger");
    }

    @Override
    void box() {
        System.out.println("boxing CheeseBurger");
    }

    @Override
    public void deliver() {
        System.out.println("delivering CheeseBurger");
    }
}
