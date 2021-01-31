package com.abel.dp.observer;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/30 10:40 下午
 */
public class ObserverClient {
    public static void main(String[] args) {
        // 设置通知对象
        Informer informer = new ConcreteInformer1();

        //设置观察者
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        informer.add(observer1);
        informer.add(observer2);
        informer.inform();
        
    }
}
