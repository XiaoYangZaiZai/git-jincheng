package singleton.ityang.thread;

public class Cook extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.object) {
                if (Desk.count == 0) {
                    break;
                } else {
                    if (Desk.foodFlag == 0) {
                        try {
                            Desk.object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        Desk.count--;
                        if(Desk.count>0)
                        System.out.println("吃货正在吃食物，还可以再吃"+Desk.count+"碗");
                        else System.out.println("吃货正在吃食物，不可以再吃了");
                        Desk.foodFlag=0;
                        Desk.object.notifyAll();
                    }
                }

            }
        }
    }
}
