package singleton.ityang.lazy.president6;

public enum President {
    PRESIDENT("拜登");
    private President(String name){
        this.name=name;
    }
    private  String name;

    @Override
    public String toString() {
        return "President{" +
                "name='" + name + '\'' +
                '}';
    }
}
class PresidentDemo{
    public static void main(String[] args) {
        new Thread(()-> System.out.println(President.PRESIDENT)).start();
        new Thread(()-> System.out.println(President.PRESIDENT)).start();
    }
}