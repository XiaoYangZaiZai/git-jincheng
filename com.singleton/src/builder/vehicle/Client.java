package builder.vehicle;



public class Client {
    public static void main(String[] args) {
        Factory factory = new CarFactory();
        Vehicle vehicle = factory.createVehicle();
        System.out.println(vehicle);

    }

}
