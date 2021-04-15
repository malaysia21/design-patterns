package behavioral.observer;

public class Test {

    public static void main(String[] args) {
        Publisher messagePublisher = new MessagePublisher();

        Subscriber emailSubscriber = new EmailSubscriber("test@gmail.com");
        Subscriber emailSubscriber2 = new EmailSubscriber("test2@gmail.com");
        Subscriber smsSubscriber = new SmsSubscriber("500600700");

        messagePublisher.attach(emailSubscriber);
        messagePublisher.attach(emailSubscriber2);

        messagePublisher.notify(new Message("Promotion message 1"));

        messagePublisher.detach(emailSubscriber2);
        messagePublisher.attach(smsSubscriber);

        messagePublisher.notify(new Message("Promotion message 2"));
    }
}
