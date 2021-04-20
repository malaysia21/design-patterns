package structural.proxy;

public class Test {

    public static void main(String[] args) {
        RealObject proxy = new ProxyRealObject();
        proxy.doSomething();
    }
}
