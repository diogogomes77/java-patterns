package dev.dgomes.factory.hamburgerStore;

public abstract class Hamburger {
    String name;
    String sauce;
    String box;

    void prepare(){
        System.out.println("preparing " + name);
    }
    void cook() {
        System.out.println("cooking " + name + " with " + sauce);
    }
    void box() {
        System.out.println("boxing " + name + " in " + box);
    }

    public abstract void deliver();
}
