package chapter09.all;

/**
 * 懒汉式，线程不安全
 */
public class NotThreadSafeLazySingleton {

    private static NotThreadSafeLazySingleton instance;

    private NotThreadSafeLazySingleton() {
    }

    public static NotThreadSafeLazySingleton getInstance() {
        if (instance == null) {
            instance = new NotThreadSafeLazySingleton();
        }
        return instance;
    }
}
