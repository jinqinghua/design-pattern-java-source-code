package chapter18;

public abstract class Command {
    public abstract void execute();
}


class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }
}


class ConcreteCommand extends Command {
    private Receiver receiver;

    @Override
    public void execute() {
        receiver.action();
    }
}


class Receiver {
    public void action() {
        // 具体操作
    }
}
