package structural.proxy;

public class RealObjectImpl implements RealObject {
    @Override
    public void doSomething() {
        System.out.println("RealObject doSomething method");
    }
}
