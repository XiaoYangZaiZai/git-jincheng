package singleton.ityang;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    static Lock lock=new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.println(Singleton.getSingleton());
            Thread.sleep(300);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
