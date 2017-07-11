package chapter07.sample02;

public class CarDirector {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car build() {
        carBuilder.buildBrand();
        carBuilder.buildEngine();
        carBuilder.buildWheels();

        return carBuilder.getCar();
    }
}
