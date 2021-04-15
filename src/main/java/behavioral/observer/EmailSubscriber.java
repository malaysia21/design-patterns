package behavioral.observer;

import lombok.Data;

@Data
public class EmailSubscriber implements Subscriber{

    private final String email;

    @Override
    public void sendMessage(Message message) {
        System.out.println("EmailSubscriber send message: " + message.getMessage() + " to " + this.email);
    }
}
