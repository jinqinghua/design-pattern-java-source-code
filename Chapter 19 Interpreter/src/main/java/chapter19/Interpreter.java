package chapter19;

import javax.naming.Context;

public class Interpreter {
}


abstract class AbstractExpression {
    public abstract void interpret(Context ctx);
}


class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context ctx) {
        // 对于终结符表达式的解释操作
    }
}


class NonterminalExpression extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;

    public NonterminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void interpret(Context ctx) {
        // 递归调用每一个组成部分的interpret()方法
        // 在递归调用时指定组成部分的连接方式，即非终结符的功能
    }
}
