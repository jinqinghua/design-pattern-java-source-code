package chapter11;

public class Bridge {

}


interface Implementor {
    public void operationImpl();
}


class ConcreteImplementor implements Implementor {
    public void operationImpl() {
        // 具体实现
    }
}


abstract class Abstraction {
    protected Implementor impl;

    public void setImpl(Implementor impl) {
        this.impl = impl;
    }

    public abstract void operation();
}


class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        // 代码
        impl.operationImpl();
        // 代码
    }
}
