package chapter15.sample01;

// ConcreteFlyweight: 具体享元类
public class Hub implements NetworkDevice {
    private String type;

    public Hub(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("Linked by Hub, type is " + this.type);
    }
}
