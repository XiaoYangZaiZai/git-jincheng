package factory.ityang.aircfactory;

interface AbstractAirCFactory {
    public AirC getInstance();
}

class HaierAirCFactory implements AbstractAirCFactory{

    @Override
    public AirC getInstance() {
        return new HaierAirC();
    }
}

class HisenseAirCFactory implements AbstractAirCFactory{

    @Override
    public AirC getInstance() {
        return new HisenseAirC();
    }
}

class TCLAirCFactory implements AbstractAirCFactory{

    @Override
    public AirC getInstance() {
        return new TCLAirC();
    }
}