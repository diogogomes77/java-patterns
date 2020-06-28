package dev.dgomes.decorator;

public class VanillaIceCream extends IceCreamDecorator {

    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Added Vanilla Ice-Cream");
        return 1.0 + super.cost();
    }
}
