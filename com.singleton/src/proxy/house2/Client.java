package proxy.house2;

public class Client {
    public static void main(String[] args) {
        HouseSaler houseSaler =(HouseSaler) ProxyUtil.getProxyObject(new HouseSalerImpl());
        houseSaler.sale();
    }
}
