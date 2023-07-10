package proxy.house;

public interface House {
    public void buyhouse();
}
class NewHouse implements House{

    @Override
    public void buyhouse() {
        System.out.println("买房...");
    }
}

