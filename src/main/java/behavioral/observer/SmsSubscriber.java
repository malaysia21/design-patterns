package behavioral.observer;

import lombok.Data;

@Data
public class SmsSubscriber implements Subscriber {
    private final String number;

    @Override
    public void sendMessage(Message message) {
        System.out.println("SMSSubscriber send message: " + message.getMessage() + " to " + this.number);
    }
}
