package chapter07.sample02;

public class QQBuilder extends CarBuilder {

    @Override
    public void buildBrand() {
        car.setBrand("QQ");

    }

    @Override
    public void buildEngine() {
        car.setEngine(new Engine("Engine QQ"));

    }

    @Override
    public void buildWheels() {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel("Kmohu");
        }
        car.setWheels(wheels);
    }

}
