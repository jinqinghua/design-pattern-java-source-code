package chapter16.sample01;

// Subject: 抽象主题角色
public interface AbstractPermission {

    void modifyUserInfo();

    void viewNote();

    void publishNote();

    void modifyNote();

    void setLevel(int level);
}
