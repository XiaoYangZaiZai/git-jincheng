package proxy;

public class Client {
    public static void main(String[] args) {
        Star star = ProxyUtil.getProxyObject(new BigStar());
        star.sing("基尼泰美");
    }
}
