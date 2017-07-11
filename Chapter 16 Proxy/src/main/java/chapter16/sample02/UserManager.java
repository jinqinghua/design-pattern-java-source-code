package chapter16.sample02;


import java.util.List;


// RealSubject: 真实主题角色
public class UserManager implements AbstractUserManager {

    @Override
    public User create(User user) {
        System.out.println("create user");
        return null;
    }

    @Override
    public int update(User user) {
        System.out.println("update user");
        return 0;
    }

    @Override
    public int deleteById(Long id) {
        System.out.println("delete user by id");
        return 0;
    }

    @Override
    public User findById(Long id) {
        System.out.println("find user by id");
        return null;
    }

    @Override
    public List<User> findAll() {
        System.out.println("find all users");
        return null;
    }
}
