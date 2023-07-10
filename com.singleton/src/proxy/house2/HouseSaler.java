package proxy.house2;

public interface HouseSaler {
    void sale();
}
class HouseSalerImpl implements HouseSaler{

    @Override
    public void sale() {
        System.out.println("step2:卖房...");
    }
}