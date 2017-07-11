package chapter16.sample02;

import java.util.List;

// Subject: 抽象主题角色
public interface AbstractUserManager {
    User create(User user);

    int update(User user);

    int deleteById(Long id);

    User findById(Long id);

    List<User> findAll();
}


