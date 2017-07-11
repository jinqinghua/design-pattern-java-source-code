package chapter17;

public class CoR {
}


abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(String request);
}


class ConcreteHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        // 条件
        super.successor.handleRequest(request); // 转发请求
    }
}
