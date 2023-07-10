package singleton.ityang;

public class LoadBalanceDemo {
    public static void main(String[] args) {
        Object object=new Object();
        synchronized (object) {
            new Thread(() -> System.out.println(LoadBalance.getLoadBalance())).start();
        }
        synchronized (object) {
            new Thread(() -> System.out.println(LoadBalance.getLoadBalance())).start();
        }
    }
}

//单线程：主线程 main 和gc 垃圾回收线程
class LoadBalance {
    private static LoadBalance loadBalance = null;

    private LoadBalance() {
    }


    public static LoadBalance getLoadBalance() {
        if (loadBalance == null) {
            loadBalance = new LoadBalance();
        }
        return loadBalance;
    }


}
