package chapter18.sample01;

public class TVChangeCommand implements AbstractCommand {
    private Television tv;

    public TVChangeCommand() {
        tv = new Television();
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
