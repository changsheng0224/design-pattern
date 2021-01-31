package com.abel.dp.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * description 懒汉式
 * 1. 私有化构造函数：不能通过构造函数，创建对象
 * 2。 通过静态方法，得到对象
 * @author wangchangsheng
 * @date 2021/1/17 6:34 下午
 */
public class SingletonHungry {

    //单例对象
    private static SingletonHungry s = new SingletonHungry();

    // 定时器
    private AtomicLong count = new AtomicLong(0);
    // 私有化构造函数
    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return s;
    }

    public AtomicLong getCount() {
        return count;
    }

    public void setCount(AtomicLong count) {
        this.count = count;
    }
}
