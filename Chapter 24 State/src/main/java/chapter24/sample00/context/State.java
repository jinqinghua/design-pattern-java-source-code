package chapter24.sample00.context;

public abstract class State {
    // 声明抽象业务方法，不同的具体状态类可以不同的实现
    public abstract void handle();
}


class ConcreteStateA extends State {
    @Override
    public void handle() {
        // 方法具体实现代码
        System.out.println("A.handle()");
    }
}


class ConcreteStateB extends State {
    @Override
    public void handle() {
        // 方法具体实现代码
        System.out.println("B.handle()");
    }
}


class Context {
    private State state; // 维持一个对抽象状态对象的引用
    private int value; // 其他属性值，该属性值的变化可能会导致对象状态发生变化

    // 设置状态对象
    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        // 其他代码
        state.handle(); // 调用状态对象的业务方法
        // 其他代码
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public State getState() {
        return state;
    }

    public void changeState() {
        // 判断属性值，根据属性值进行状态转换
        if (value == 0) {
            this.setState(new ConcreteStateA());
        } else if (value == 1) {
            this.setState(new ConcreteStateB());
        }
    }
}
