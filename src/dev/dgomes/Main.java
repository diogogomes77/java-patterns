package dev.dgomes;

import dev.dgomes.decorator.BasicIceCream;
import dev.dgomes.decorator.IceCream;
import dev.dgomes.decorator.MintIceCream;
import dev.dgomes.decorator.VanillaIceCream;
import dev.dgomes.observer.EmailTopic;
import dev.dgomes.observer.EmailTopicSubscriber;
import dev.dgomes.observer.Observer;

public class Main {

    public static void main(String[] args) {
        //runObserver();
        runDecorator();
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

        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-cream cost $" + basicIceCream.cost());

        IceCream vanilla = new VanillaIceCream(basicIceCream);
        System.out.println("Vanilla Ice-cream cost $" + vanilla.cost());

        IceCream mint = new MintIceCream(vanilla);
        System.out.println("Mint Ice-cream cost $" + mint.cost());
    }
}
