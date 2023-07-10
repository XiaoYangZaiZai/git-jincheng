package factory.ityang.abstractfactory;

public class Window {
    public static void main(String[] args) {
        Factory factory=new HaierFactory();
        factory.getAirC().display();
        factory.getTV().see();
    }
}