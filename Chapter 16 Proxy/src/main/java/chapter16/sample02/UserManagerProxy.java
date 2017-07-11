package chapter16.sample02;


import java.util.List;

// Proxy: 代理主题角色
public class UserManagerProxy implements AbstractUserManager {
    private UserManager userManager = new UserManager();
    private long startTime;
    private long endTime;

    @Override
    public User create(User user) {
        beforeMethod();
        User t = userManager.create(user);
        afterMethod();
        return t;
    }

    @Override
    public int update(User user) {
        beforeMethod();
        int i = userManager.update(user);
        afterMethod();
        return i;
    }

    @Override
    public int deleteById(Long id) {
        beforeMethod();
        int i = userManager.deleteById(id);
        afterMethod();
        return i;
    }

    @Override
    public User findById(Long id) {
        beforeMethod();
        User t = userManager.findById(id);
        afterMethod();
        return t;
    }

    @Override
    public List<User> findAll() {
        beforeMethod();
        List<User> users = userManager.findAll();
        afterMethod();
        return users;
    }

    private void beforeMethod() {
        startTime = System.currentTimeMillis();
        System.out.println("beforeMethod...");
    }

    private void afterMethod() {
        System.out.println("afterMethod...");
        endTime = System.currentTimeMillis();
        System.out.printf("Method excute time: %d (ms)\n\n", endTime - startTime);
    }
}
