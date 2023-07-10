package builder.vehicle;

public class Vehicle {
    private static Vehicle vehicle;
    private String tyre;
    private String engine;
    private String Steering;

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getSteering() {
        return Steering;
    }

    public void setSteering(String steering) {
        Steering = steering;
    }

    private Vehicle() {

    }

    public static Vehicle getInstance() {
        if (vehicle == null) {
            synchronized (Vehicle.class) {
                if (vehicle == null) {
                    vehicle = new Vehicle();
                }
            }
        }
        return vehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "tyre='" + tyre + '\'' +
                ", engine='" + engine + '\'' +
                ", Steering='" + Steering + '\'' +
                '}';
    }
}
