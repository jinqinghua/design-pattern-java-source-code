package chapter08.sample03;

import java.util.Hashtable;

interface MyColor extends Cloneable {
    Object clone();

    void display();
}


class Red implements MyColor {
    @Override
    public Object clone() {
        Red r = null;
        try {
            r = (Red) super.clone();
        } catch (CloneNotSupportedException e) {

        }
        return r;
    }

    @Override
    public void display() {
        System.out.println("This is Red!");
    }
}


class Blue implements MyColor {
    @Override
    public Object clone() {
        Blue b = null;
        try {
            b = (Blue) super.clone();
        } catch (CloneNotSupportedException e) {

        }
        return b;
    }

    @Override
    public void display() {
        System.out.println("This is Blue!");
    }
}


class PrototypeManager {
    private Hashtable ht = new Hashtable();

    public PrototypeManager() {
        ht.put("red", new Red());
        ht.put("blue", new Blue());
    }

    public void addColor(String key, MyColor obj) {
        ht.put(key, obj);
    }

    public MyColor getColor(String key) {
        return (MyColor) ((MyColor) ht.get(key)).clone();
    }
}


class Client {
    public static void main(String args[]) {
        PrototypeManager pm = new PrototypeManager();

        MyColor obj1 = pm.getColor("red");
        obj1.display();

        MyColor obj2 = pm.getColor("red");
        obj2.display();

        System.out.println(obj1 == obj2);
    }
}
