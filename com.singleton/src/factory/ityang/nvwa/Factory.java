package factory.ityang.nvwa;

public interface Factory {
    Person getPerson();
}

class ManFactory implements Factory{

    @Override
    public Person getPerson() {
        return new Man();
    }
}

class WomanFactory implements Factory{

    @Override
    public Person getPerson() {
        return new Woman();
    }
}