package chapter23.sample01;

import java.util.ArrayList;
import java.util.List;

public abstract class MySubject {
    protected List<MyObserver> observers = new ArrayList<>();

    // 注册方法
    public void attach(MyObserver observer) {
        observers.add(observer);
    }

    // 注销方法
    public void detach(MyObserver observer) {
        observers.remove(observer);
    }

    public abstract void cry(); // 抽象通知方法
}
