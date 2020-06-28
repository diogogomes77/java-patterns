package dev.dgomes.factory.hamburgerStore;

public abstract class Hamburger {
    abstract void prepare();
    abstract void cook();
    abstract void box();
    public abstract void deliver();
}
