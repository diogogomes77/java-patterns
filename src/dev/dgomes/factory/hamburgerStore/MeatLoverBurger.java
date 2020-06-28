package dev.dgomes.factory.hamburgerStore;

public class MeatLoverBurger extends Hamburger {
    @Override
    void prepare() {
        System.out.println("preparing MeatLoverBurger");
    }

    @Override
    void cook() {
        System.out.println("cooking MeatLoverBurger");
    }

    @Override
    void box() {
        System.out.println("boxing MeatLoverBurger");
    }

    @Override
    public void deliver() {
        System.out.println("delivering MeatLoverBurger");
    }
}
