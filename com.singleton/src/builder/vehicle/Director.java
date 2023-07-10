package builder.vehicle;

public class Director {
    private Builder builder;

    Director(Builder builder){
        this.builder=builder;
    }

    public Vehicle construct() {
        builder.setTyre("tyre");
        builder.setEngine("eng");
        builder.setSteering("steer");

        return builder.getVehicle();
    }
}
