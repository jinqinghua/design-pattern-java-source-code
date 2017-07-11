package chapter07.sample02;

public abstract class CarBuilder {
    protected Car car = new Car();

    public abstract void buildBrand();

    public abstract void buildEngine();

    public abstract void buildWheels();

    public Car getCar() {
        return this.car;
    }
}
