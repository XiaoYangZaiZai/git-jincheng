package factory.ityang.aircfactory;

public class Window {
    public static void main(String[] args) {
        AbstractAirCFactory factory=new HaierAirCFactory();
        factory.getInstance().display();
    }
}
