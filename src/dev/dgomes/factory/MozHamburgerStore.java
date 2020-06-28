package dev.dgomes.factory;

import dev.dgomes.factory.hamburgerStore.*;

public class MozHamburgerStore extends HamburgerStore{
    @Override
    public Hamburger createHamburger(HamburgerType tipo) {
        Hamburger burger;
        switch (tipo){
            case cheeseburger:
                burger = new MozCheeseBurger();
                break;
            case meatloverburger:
                burger = new MozMeatLoverBurger();
                break;
            case veggieburger:
                burger = new MozVeggieBurger();
                break;
            default:
                burger = null;
                break;
        }
        return burger;
    }
}
