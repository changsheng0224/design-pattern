package com.abel.dp.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * description 懒汉式
 *
 * @author wangchangsheng
 * @date 2021/1/17 6:38 下午
 */
public class SingletonLazy {

    //单例对象
    private static SingletonLazy s = new SingletonLazy();

    // 用作计数器
    private AtomicLong count = new AtomicLong(0);

    // 私有化构造函数
    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getInstance() {
        if (s == null) {
            s = new SingletonLazy();
        }
        return s;
    }

    // 自身属性
    public AtomicLong getCount() {
        return count;
    }

    public void setCount() {
        this.count.addAndGet(1);
    }
}
