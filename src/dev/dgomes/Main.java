package dev.dgomes;

import dev.dgomes.observer.EmailTopic;
import dev.dgomes.observer.EmailTopicSubscriber;
import dev.dgomes.observer.Observer;

public class Main {

    public static void main(String[] args) {
        runObserver();
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
}
