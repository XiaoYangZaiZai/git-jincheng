package builder.vehicle;

public abstract class Builder {
   abstract void setTyre(String tyre);
   abstract void setEngine(String engine);
   abstract void setSteering(String steering);
   abstract Vehicle getVehicle();

}
