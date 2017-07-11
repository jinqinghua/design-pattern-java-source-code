package chapter16.sample01;

// Subject: 抽象主题角色
public interface AbstractPermission {

    public void modifyUserInfo();

    public void viewNote();

    public void publishNote();

    public void modifyNote();

    public void setLevel(int level);
}
