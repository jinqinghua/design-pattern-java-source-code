package chapter06.sample01;

public class TCLAirConditioner implements AirConditioner {
    @Override
    public void changeTemperature() {
        System.out.println("TCL空调温度改变中......");
    }
}
