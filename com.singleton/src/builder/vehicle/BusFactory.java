package builder.vehicle;



public class BusFactory implements  Factory{

    @Override
    public Vehicle createVehicle() {
        return new Director(new BusBuilder()).construct();
    }
}
