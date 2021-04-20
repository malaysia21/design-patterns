package structural.proxy;

public class ProxyRealObject extends RealObjectImpl {

    @Override
    public void doSomething() {
        System.out.println("Proxy delegating task to RealObject");
        super.doSomething();
    }
}
