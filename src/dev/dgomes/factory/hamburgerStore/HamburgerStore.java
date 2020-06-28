package dev.dgomes.factory.hamburgerStore;

import dev.dgomes.factory.hamburgerStore.Hamburger;
import dev.dgomes.factory.hamburgerStore.HamburgerType;
import dev.dgomes.factory.hamburgerStore.SimpleHamburgerFactory;

public abstract class HamburgerStore {

    public Hamburger orderHamburger(HamburgerType tipo){
        Hamburger burger;
        burger = createHamburger(tipo);
        burger.prepare();
        burger.cook();
        burger.box();
        return burger;
    }

    protected abstract Hamburger createHamburger(HamburgerType tipo);

}
