package singleton.ityang.lazy.president5;

class President {
    private static volatile President president;
    private President(){
    }
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private static class Inner{
        public static final President president= new President();
    }

    public static President getInstance(String name){
        Inner.president.setName(name);
        return Inner.president;
    }

    @Override
    public String toString() {
        return "President{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class PresidentDemo {
    public static void main(String[] args) {
        new Thread(()-> System.out.println(President.getInstance("拜登").toString())).start();
        new Thread(()-> System.out.println(President.getInstance("拜登").toString())).start();
    }
}
