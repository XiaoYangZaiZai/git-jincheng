package role;

public interface Factory {
    Role getRole();
}

class AngelFactory implements Factory{

    @Override
    public Role getRole() {
        return new Director(new AngelBuilder()).Construct();
    }
}

class DemonFactory implements Factory{

    @Override
    public Role getRole() {
        return new Director(new DemonBuilder()).Construct();
    }
}
