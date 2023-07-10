package factory.ityang.abstractfactory;

public class HaierAirC implements AirC {
    HaierAirC(){}
    @Override
    public void display() {
        System.out.println("海尔空调");
    }
}
