package chapter16.DynamicProxy;

public class RealSubjectA implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("真实主题类A！");
    }
}
