package chapter11.sample01;

public class Black implements Color {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType + "黑色的" + name + ".");
    }
}
