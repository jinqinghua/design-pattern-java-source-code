package chapter06.sample01;

public class HairAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("海尔空调温度改变中......");
    }
}
