package chapter21;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
    protected List<Colleague> colleagues = new ArrayList<>();

    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    public abstract void operation();
}


abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void method1();

    public abstract void method2();
}


class ConcreteMediator extends Mediator {
    @Override
    public void operation() {
        // ......
        (colleagues.get(0)).method1();
        (colleagues.get(0)).method2();
        // ......
    }
}


class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void method1() {
        mediator.operation();
    }

    @Override
    public void method2() {
        mediator.operation();
    }
}
