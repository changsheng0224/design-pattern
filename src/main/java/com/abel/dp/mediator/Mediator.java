package com.abel.dp.mediator;

/**
 * description 抽象中介者
 * 为Colleague对象定义一个交流接口
 *
 * @author wangchangsheng
 * @date 2021/1/31 12:04 上午
 */
abstract class Mediator {
    public abstract void send(String message, Colleague colleagur);
}
