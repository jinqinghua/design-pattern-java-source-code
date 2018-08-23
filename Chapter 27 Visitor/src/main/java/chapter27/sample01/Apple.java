package chapter27.sample01;

public class Apple implements Product {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
