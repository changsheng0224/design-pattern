package com.abel.dp.observer;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/30 10:39 下午
 */
public class ConcreteObserver2 implements Observer {

    @Override
    public void update() {
        System.out.println("Informer发生了推送，观察者2进行更新");
    }
}
