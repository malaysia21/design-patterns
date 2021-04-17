package creational.singletion;

import java.io.*;

public class Test {

    public static void main(String[] args) {
        DemoSingleton instance = DemoSingleton.getInstance();
        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            out.writeObject(instance);
            out.close();

            instance.setI(20);

            ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
            DemoSingleton instanceAfterDeserialization = (DemoSingleton) in.readObject();
            in.close();

            System.out.println(instance.getI());
            System.out.println(instanceAfterDeserialization.getI());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
