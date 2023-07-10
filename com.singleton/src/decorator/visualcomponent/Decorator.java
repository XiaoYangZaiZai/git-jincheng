package decorator.visualcomponent;

public abstract class Decorator implements Component {
    Component component;

    Decorator(Component component) {
        this.component = component;
    }
}
