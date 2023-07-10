package singleton.ityang.eager;

public class EagerSingleton2 {
    private static EagerSingleton2 eagerSingleton2;

    static{
        eagerSingleton2=new EagerSingleton2();
    }
    private EagerSingleton2() {

    }

    public EagerSingleton2 getInstance(){
        return  eagerSingleton2;
    }
}
