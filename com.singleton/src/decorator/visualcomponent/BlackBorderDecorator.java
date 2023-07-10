package decorator.visualcomponent;

public class BlackBorderDecorator extends Decorator {
    BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void getComponentName(String type) {
        component.getComponentName(type);
    }
}
