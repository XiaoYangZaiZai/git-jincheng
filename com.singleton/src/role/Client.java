package role;

public class Client {
    public static void main(String[] args) {
        Factory factory1=new AngelFactory();
        System.out.println(factory1.getRole().toString());


        Factory factory2=new DemonFactory();
        System.out.println(factory2.getRole().toString());
    }
}
