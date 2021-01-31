package com.abel.dp.observer;

/**
 * description 抽象通知者
 *
 * @author wangchangsheng
 * @date 2021/1/30 6:46 下午
 */
public interface Informer {
    // 增加观察者
    void add(Observer observer);

    // 取消观察者
    void delete(Observer observer);

    // 通知操作
    void inform();
}
