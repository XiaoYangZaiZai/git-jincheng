package factory.ityang.abstractfactory;

public class TCLAirC implements AirC {
    TCLAirC(){}
    @Override
    public void display() {
        System.out.println("TCL空调");
    }
}
