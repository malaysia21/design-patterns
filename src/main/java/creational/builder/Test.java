package creational.builder;

public class Test {

    public static void main(String[] args) {
        User.UserBuilder userBuilder = new User.UserBuilder("Tom", "Smith");

        User user = userBuilder.build();

        User user2 = userBuilder
                .phoneNumber("505600700")
                .address("Warsaw")
                .build();

        System.out.println(user);
        System.out.println(user2);
    }
}
