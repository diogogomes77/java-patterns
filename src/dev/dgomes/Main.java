package dev.dgomes;

import dev.dgomes.decorator.BasicIceCream;
import dev.dgomes.decorator.IceCream;
import dev.dgomes.decorator.MintIceCream;
import dev.dgomes.decorator.VanillaIceCream;
import dev.dgomes.factory.hamburgerStore.HamburgerStore;
import dev.dgomes.factory.JamHamburgerStore;
import dev.dgomes.factory.MozHamburgerStore;
import dev.dgomes.factory.SimpleHamburgerStore;
import dev.dgomes.factory.hamburgerStore.Hamburger;
import dev.dgomes.factory.hamburgerStore.HamburgerType;
import dev.dgomes.observer.EmailTopic;
import dev.dgomes.observer.EmailTopicSubscriber;
import dev.dgomes.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //runObserver();
        //runDecorator();
        //runSimpleFactory();
        runFactoryPatern();
    }

    private static void runObserver(){
        System.out.println("runObserver");
        EmailTopic topic1 = new EmailTopic("topico1");
        //EmailTopic topic2 = new EmailTopic("topico2");
        Observer obs1 = new EmailTopicSubscriber("sub1");
        Observer obs2 = new EmailTopicSubscriber("sub2");
        Observer obs3 = new EmailTopicSubscriber("sub3");
        topic1.register(obs1);
        topic1.register(obs2);
        //topic2.register(obs2);
        //topic2.register(obs3);
        obs1.setSubject(topic1);
        obs2.setSubject(topic1);
        topic1.postMessage("Hello Subscribers!");
        topic1.unregister(obs1);
        topic1.postMessage("Hello Subscribers!");
    }
    private static void runDecorator(){
        System.out.println("runDecorator");
        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-cream cost $" + basicIceCream.cost());

        IceCream vanilla = new VanillaIceCream(basicIceCream);
        System.out.println("Vanilla Ice-cream cost $" + vanilla.cost());

        IceCream mint = new MintIceCream(vanilla);
        System.out.println("Mint Ice-cream cost $" + mint.cost());
    }
    private static void runSimpleFactory(){
        System.out.println("runSimpleFactory");
        SimpleHamburgerStore store = new SimpleHamburgerStore();
        Hamburger burger;
        for (HamburgerType tipo : HamburgerType.values()) {
            burger = store.orderHamburger(tipo);
            burger.deliver();
        }

    }
    private static void runFactoryPatern(){
        System.out.println("runFactoryPatern");
        List<HamburgerStore> stores = new ArrayList<>();
        stores.add(new MozHamburgerStore());
        stores.add(new JamHamburgerStore());
        Hamburger burger;
        for (HamburgerStore store : stores){
            for (HamburgerType tipo : HamburgerType.values()) {
                burger = store.orderHamburger(tipo);
                burger.deliver();
            }
        }


    }
}
