package dev.dgomes.factory;

import dev.dgomes.factory.hamburgerStore.*;

public class JamHamburgerStore extends HamburgerStore{
    @Override
    public Hamburger createHamburger(HamburgerType tipo) {
        Hamburger burger;
        switch (tipo){
            case cheeseburger:
                burger = new JamCheeseBurger();
                break;
            case meatloverburger:
                burger = new JamMeatLoverBurger();
                break;
            case veggieburger:
                burger = new JamVeggieBurger();
                break;
            default:
                burger = null;
                break;
        }
        return burger;
    }
}
