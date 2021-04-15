package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Publisher {
    private List<Subscriber> subscriberList = new ArrayList<>();

    @Override
    public void attach(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void detach(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notify(Message message) {
        subscriberList.forEach(sub -> sub.sendMessage(message));
    }
}
