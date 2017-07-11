package chapter23.sample01;

public class Pig implements MyObserver {
    @Override
    public void response() {
        System.out.println("猪没有反应！");
    }
}
