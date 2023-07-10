package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


public class Demo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        FutureTask<Integer> task = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("task is running...");
                Thread.sleep(3000);
                return 1000;
            }
        });
       Thread t1 = new Thread(task,"t1");
       t1.start();
        System.out.println("task.get() = " + task.get());
    }
}


