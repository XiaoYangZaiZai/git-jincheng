package factory.ityang.factorymethod;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        while(true){
        Thread.sleep(3000);
        Factory factory= (Factory) XMLUtil.getBean("com.singleton//src//factory//ityang//factorymethod//config.xml");
        Chart instance = factory.getInstance();
        instance.display();
    }
    }
}
