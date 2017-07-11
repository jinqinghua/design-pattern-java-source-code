package chapter15.sample01;

// ConcreteFlyweight: 具体享元类
public class Switch implements NetworkDevice {
    private String type;

    public Switch(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("Linked by switch, type is " + this.type);
    }
}
