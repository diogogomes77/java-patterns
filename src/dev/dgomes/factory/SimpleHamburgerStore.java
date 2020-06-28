package dev.dgomes.factory;

import dev.dgomes.factory.hamburgerStore.HamburgerType;
import dev.dgomes.factory.hamburgerStore.SimpleHamburgerFactory;
import dev.dgomes.factory.hamburgerStore.Hamburger;

public class SimpleHamburgerStore {

    SimpleHamburgerFactory factory;

    public SimpleHamburgerStore(){
        this.factory = new SimpleHamburgerFactory();
    }

    public Hamburger orderHamburger(HamburgerType tipo){
        Hamburger burger;
        burger = factory.createHamburger(tipo);
        //burger.prepare();
        //burger.cook();
        //burger.box();
        return burger;
    }

}
