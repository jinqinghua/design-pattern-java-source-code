package chapter09.all;

public class ThreadSafeSingletonWithSingletonHolder {

    private static class SingletonHolder {
        private static final ThreadSafeSingletonWithSingletonHolder INSTANCE = new ThreadSafeSingletonWithSingletonHolder();
    }

    private ThreadSafeSingletonWithSingletonHolder() {
    }

    public static final ThreadSafeSingletonWithSingletonHolder getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
