package observer;

import java.util.ArrayList;
import java.util.List;

public class Demo {
}

abstract class AbstractSubject{
    List<AbstractObserver> observerList = new ArrayList<>();
    public abstract void addObserver(AbstractObserver abstractObserver);
    public abstract void removeObserver(AbstractObserver abstractObserver);
    public abstract void notifyObserver();
}
class ConcreteSubject extends AbstractSubject{

    @Override
    public void addObserver(AbstractObserver abstractObserver) {
        observerList.add(abstractObserver);
    }

    @Override
    public void removeObserver(AbstractObserver abstractObserver) {
        observerList.remove(abstractObserver);
    }

    @Override
    public void notifyObserver() {
        for (AbstractObserver abstractObserver : observerList) {
            abstractObserver.update();
        }
    }
}
abstract class AbstractObserver{
    public abstract void update();
}
class ConcreteObserver1 extends AbstractObserver{
    public void update(){
        System.out.println("更新");
    }
}
class ConcreteObserver2 extends AbstractObserver{
    public void update(){
        System.out.println("更新");
    }
}
