package dev.gihwan.designpatterns.observer;

public class ConcreteObserverA implements Observer<Integer> {

    private final String name;

    public ConcreteObserverA(String name) {
        this.name = name;
    }

    @Override
    public void update(Integer value) {
        System.out.println("[" + name + "] updated value = " + value);
    }
}
