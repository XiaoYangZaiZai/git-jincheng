package decorator.demo;

public class Client {
    public static void main(String[] args) {
        new ConcreteDecorationA(new ConcreteDecorationB(new ConcreteComponent())).operation();
    }
}
