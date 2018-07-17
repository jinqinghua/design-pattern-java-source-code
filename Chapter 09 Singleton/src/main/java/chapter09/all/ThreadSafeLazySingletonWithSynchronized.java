package chapter09.all;

/**
 * 懒汉式，线程安全, 不高效。因为在任何时候只能有一个线程调用 getInstance() 方法
 */
public class ThreadSafeLazySingletonWithSynchronized {

    private static ThreadSafeLazySingletonWithSynchronized instance;

    private ThreadSafeLazySingletonWithSynchronized() {
    }

    public static synchronized ThreadSafeLazySingletonWithSynchronized getInstance() { // synchronized
        if (instance == null) {
            instance = new ThreadSafeLazySingletonWithSynchronized();
        }
        return instance;
    }
}
