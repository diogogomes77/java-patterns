package dev.dgomes.factory.hamburgerStore;

public class SimpleHamburgerFactory {

    Hamburger burger;

    public Hamburger createHamburger(HamburgerType tipo) {
        switch (tipo){
            case cheeseburger:
                burger = new CheeseBurger();
                break;
            case meatloverburger:
                burger = new MeatLoverBurger();
                break;
            case veggieburger:
                burger = new VeggieBurger();
                break;
        }
        burger.prepare();
        burger.cook();
        burger.box();
        return burger;
    }
}
