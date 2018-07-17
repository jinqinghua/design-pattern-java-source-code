package chapter09.all;

/**
 * 懒汉式，
 * 双重检验锁，
 * 使用了 volatile，注意Java5后没有问题，Java5之前是有问题的
 */
public class ThreadSafeLazySingletonWithDoubleCheckedLockingAndVolatile {

    private volatile static ThreadSafeLazySingletonWithDoubleCheckedLockingAndVolatile instance; //声明成 volatile
    private ThreadSafeLazySingletonWithDoubleCheckedLockingAndVolatile(){}

    public static ThreadSafeLazySingletonWithDoubleCheckedLockingAndVolatile getSingleton() {
        if (instance == null) {
            synchronized (ThreadSafeLazySingletonWithDoubleCheckedLockingAndVolatile.class) {
                if (instance == null) {
                    instance = new ThreadSafeLazySingletonWithDoubleCheckedLockingAndVolatile();
                }
            }
        }
        return instance;
    }

}
