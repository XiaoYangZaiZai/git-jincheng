package decorator.demo;

public class ConcreteDecorationB extends Decorator{
    ConcreteDecorationB(Component component){
        super(component);
    }

    private void addedBehavior(){
        System.out.println("addedBehavior...");
    }

    @Override
    public void operation() {
        component.operation();
        addedBehavior();
    }
}
