package behavioral.observer;

public interface Publisher {

    void attach(Subscriber subscriber);
    void detach(Subscriber subscriber);
    void notify(Message message);
}
