package singleton.ityang.lazy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo {
    public static void main(String[] args) {
//        new Thread(()-> System.out.println(LazySingleton2.getInstance())).start();
//        new Thread(()-> System.out.println(LazySingleton2.getInstance())).start();
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(()-> System.out.println(LazySingleton2.getInstance()));
        pool.submit(()-> System.out.println(LazySingleton2.getInstance()));
        pool.shutdown();
    }
}
