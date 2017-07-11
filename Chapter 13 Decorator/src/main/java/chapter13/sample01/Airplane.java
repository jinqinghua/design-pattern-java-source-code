package chapter13.sample01;

// ConcreteDecorator: 具体装饰类
public class Airplane extends Changer {
    public Airplane(Transform transform) {
        super(transform);
        System.out.println("变成飞机！");
    }

    public void fly() {
        System.out.println("在天空飞翔！");
    }
}
