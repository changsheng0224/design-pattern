package com.abel.dp.observer;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/30 6:49 下午
 */
public class ConcreteInformer1 implements Informer {

    ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void inform() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
