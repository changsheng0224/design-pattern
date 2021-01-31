package com.abel.dp.observer;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/30 10:38 下午
 */
public class ConcreteObserver1 implements Observer {

    @Override
    public void update() {
        System.out.println("Informer发生了推送，观察者1进行更新");
    }
}
