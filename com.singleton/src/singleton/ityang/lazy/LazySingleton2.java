package singleton.ityang.lazy;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LazySingleton2 {
    private static volatile LazySingleton2 instance2;//volatile 禁止指令重排序

    private LazySingleton2() {
    }

    public static LazySingleton2 getInstance(){
        if (instance2 == null) {
            synchronized (LazySingleton2.class) {
                if (instance2 == null) {
                    instance2 = new LazySingleton2();
                }
            }
        }
        return instance2;
    }
}
