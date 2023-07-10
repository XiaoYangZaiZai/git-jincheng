package singleton.ityang.thread2;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue=new ArrayBlockingQueue<>(1);
        Cook cook=new Cook(queue);
        Foodie foodie=new Foodie(queue);
        cook.start();
        foodie.start();

    }
}
