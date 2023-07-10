package proxy;

public class BigStar implements Star{
    @Override
    public void sing(String song) {
        System.out.println("鸡哥正在唱"+song);
    }

    @Override
    public void dance() {
        System.out.println("鸡哥正在跳舞");
    }
}
