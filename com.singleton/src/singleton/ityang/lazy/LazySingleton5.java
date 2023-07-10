package singleton.ityang.lazy;


//构造方法私有化
public enum LazySingleton5 {
    INSTANCE("康熙");
    private LazySingleton5(String name){
        this.name=name;
    }
    private String name;

    public String getName() {
        return name;
    }
}