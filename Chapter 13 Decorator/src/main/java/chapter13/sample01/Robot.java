package chapter13.sample01;

// ConcreteDecorator: 具体装饰类
public class Robot extends Changer {
    public Robot(Transform transform) {
        super(transform);
        System.out.println("变成机器人！");
    }

    public void say() {
        System.out.println("说话！");
    }
}
