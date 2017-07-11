package chapter15;

import java.util.HashMap;
import java.util.Map;


public class Flyweight {
    private String intrinsicState;

    public Flyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public void operation(String extrinsicState) {
        // ......
    }
}


class ConcreteFlyweight extends Flyweight {

    public ConcreteFlyweight(String intrinsicState) {
        super(intrinsicState);
    }

}


class FlyweightFactory {
    private static Map<String, Flyweight> flyweights = new HashMap<>();

    public static Flyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        } else {
            Flyweight fw = new ConcreteFlyweight("state");
            flyweights.put(key, fw);
            return fw;
        }
    }
}

