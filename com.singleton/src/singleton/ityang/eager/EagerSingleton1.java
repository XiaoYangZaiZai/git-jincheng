package singleton.ityang.eager;

public class EagerSingleton1 {
    private static final EagerSingleton1 egersingleton1 = new EagerSingleton1();
    private EagerSingleton1(){};
    public static EagerSingleton1 getInstance(){
        return egersingleton1;
    }
}
