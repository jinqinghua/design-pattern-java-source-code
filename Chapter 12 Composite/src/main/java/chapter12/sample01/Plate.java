package chapter12.sample01;

import java.util.ArrayList;
import java.util.List;

public class Plate extends MyElement {
    private List<MyElement> list = new ArrayList<>();

    public void add(MyElement element) {
        list.add(element);
    }

    public void delete(MyElement element) {
        list.remove(element);
    }

    @Override
    public void eat() {
        for (Object object : list) {
            ((MyElement) object).eat();
        }
    }
}
