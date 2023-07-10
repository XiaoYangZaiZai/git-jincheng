package singleton.ityang.demo;


public class King4 {

    private static String name;

    private King4() {

    }

    public static void setName(String name) {
        King4.name = name;
    }

    private static class Inner{
        public static final King4 king4=new King4();
    }
    public static King4 getInstance(String name){
        Inner.king4.setName(name);
        return Inner.king4;
    }

    @Override
    public String toString() {
        return "King{" +
                "name='" + name + '\'' +
                '}';
    }
}
