package dev.dgomes.observer;

public interface Observer {
    void update();
    void setSubject(Subject sub);
}
