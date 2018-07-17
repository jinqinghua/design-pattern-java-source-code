package chapter23.sample01;

public class Cat extends MySubject {
    @Override
    public void cry() {
        System.out.println("猫叫！");
        System.out.println("----------------------------");

        for (MyObserver observer : observers) {
            observer.response();
        }

    }
}
