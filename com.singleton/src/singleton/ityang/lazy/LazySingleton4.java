package singleton.ityang.lazy;

import java.io.Serializable;

public class LazySingleton4 implements Serializable{
    private LazySingleton4(){}

    private static class LazySingleton4_inner{
        public static final LazySingleton4 lazySingleton4=new LazySingleton4();
    }
    public static LazySingleton4 getInstance(){
        return LazySingleton4_inner.lazySingleton4;
    }
}
