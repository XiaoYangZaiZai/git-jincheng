package singleton.ityang.thread;

public class Foodie extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.object){
                if(Desk.count==0){
                    break;
                }else{
                    if(Desk.foodFlag==1){
                        try {
                            Desk.object.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        Desk.foodFlag=1;
                        System.out.println("厨师做了一份食物");
                        Desk.object.notifyAll();
                    }
                }
            }
        }
    }
}
