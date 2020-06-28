package dev.dgomes.observer;

public class EmailTopicSubscriber implements Observer {

    public String name;
    private Subject topic;

    public EmailTopicSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update() {

        String msg = (String)topic.getUpdate(this);

        if (msg == null)
            System.out.println("Nothing new for " + this.name);
        else
            System.out.println(msg + " for " + this.name);

    }

    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
}
