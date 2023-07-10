package builder.vehicle;

public class CarFactory implements  Factory{

    @Override
    public Vehicle createVehicle() {
        return new Director(new BusBuilder()).construct();
    }
}
