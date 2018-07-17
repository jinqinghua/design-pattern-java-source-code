package chapter09.all;

/**
 * 饿汉式，类加载时就初始化，线程安全
 */
public class ThreadSafeSingleton {

    //类加载时就初始化
    private static final ThreadSafeSingleton instance = new ThreadSafeSingleton();

    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        return instance;
    }

}
