package decorator.visualcomponent;

public class Client {
    public static void main(String[] args) {
        new BlackBorderDecorator(new RollBarDecorator(new ListComponent())).getComponentName("");
    }
}
