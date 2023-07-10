package observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Template {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver();
        subject.addObs(concreteObserver);
        subject.notifyObs();
    }
}
class ConcreteSubject extends Observable {
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }

    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }


    public void notifyObs(){
        this.notifyObservers();
    }
    public void addObs(Observer o){
        this.addObserver(o);
    }

}

class ConcreteObserver implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("...");
    }
}
