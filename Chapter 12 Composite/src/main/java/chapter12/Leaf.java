package chapter12;

public class Leaf extends Component {

    @Override
    public void add(Component c) {
    }

    @Override
    public void remove(Component c) {
    }

    @Override
    public Component getChild(int i) {
        return this;
    }

    @Override
    public void operation() {
        // 实现代码
    }
}
