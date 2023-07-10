package factory.ityang.abstractfactory;

interface Factory {
    AirC getAirC();
    TV getTV();
}

class HaierFactory implements Factory {

    @Override
    public AirC getAirC() {
        return new HaierAirC();
    }

    @Override
    public TV getTV() {
        return new HaierTV();
    }
}

class HisenseFactory implements Factory {

    @Override
    public AirC getAirC() {
        return new HisenseAirC();
    }

    @Override
    public TV getTV() {
        return new HisenseTV();
    }
}

class TCLFactory implements Factory {

    @Override
    public AirC getAirC() {
        return new TCLAirC();
    }

    @Override
    public TV getTV() {
        return  new TCLTV();
    }
}