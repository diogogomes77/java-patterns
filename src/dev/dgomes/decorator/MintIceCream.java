package dev.dgomes.decorator;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Added Mint Ice-Cream");
        return 1.50 + super.cost();
    }
}
