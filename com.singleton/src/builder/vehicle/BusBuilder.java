package builder.vehicle;

public class BusBuilder extends Builder{
    Vehicle vehicle =Vehicle.getInstance();
    @Override
    void setTyre(String tyre) {
        vehicle.setTyre(tyre);
    }

    @Override
    void setEngine(String engine) {
        vehicle.setEngine(engine);
    }

    @Override
    void setSteering(String steering) {
        vehicle.setSteering(steering);
    }


    @Override
    Vehicle getVehicle() {
        return vehicle;
    }
}
