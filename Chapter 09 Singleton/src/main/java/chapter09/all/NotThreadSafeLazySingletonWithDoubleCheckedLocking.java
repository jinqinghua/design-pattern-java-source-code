package chapter09.all;

/**
 * 懒汉式，双重检验锁，看起来完美，其实线程不安全
 */
public class NotThreadSafeLazySingletonWithDoubleCheckedLocking {

    private static NotThreadSafeLazySingletonWithDoubleCheckedLocking instance;

    private NotThreadSafeLazySingletonWithDoubleCheckedLocking() {
    }

    public static NotThreadSafeLazySingletonWithDoubleCheckedLocking getSingleton() {
        if (instance == null) {                         //Single Checked
            synchronized (NotThreadSafeLazySingletonWithDoubleCheckedLocking.class) {
                if (instance == null) {                 //Double Checked
                    instance = new NotThreadSafeLazySingletonWithDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
