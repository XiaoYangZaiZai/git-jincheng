package proxy.house;

public class Proxy implements House{
    NewHouse newHouse = new NewHouse();
    @Override
    public void buyhouse() {
        System.out.println("找房...");
        newHouse.buyhouse();
        System.out.println("other...");
    }
}
