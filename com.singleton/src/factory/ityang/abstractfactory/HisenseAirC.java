package factory.ityang.abstractfactory;

public class HisenseAirC implements AirC {
    HisenseAirC(){}
    @Override
    public void display() {
        System.out.println("海信空调");
    }
}
