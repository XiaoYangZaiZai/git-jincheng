package decorator.visualcomponent;

public class RollBarDecorator extends Decorator{
    RollBarDecorator(Component component){
        super(component);
    }
    @Override
    public void getComponentName(String type) {
        type="滚动条"+type;
        component.getComponentName(type);
    }

}
