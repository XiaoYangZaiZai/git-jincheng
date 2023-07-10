package decorator.demo;

public class ConcreteDecorationA extends Decorator{
    ConcreteDecorationA(Component component){
        super(component);
    }

    private void addedState(){
        System.out.println("addedState...");
    }

    @Override
    public void operation() {
        component.operation();
        addedState();
    }
}
