package com.abel.dp.mediator;

/**
 * description 每个 Colleague 对象应该知道它的 Mediator 对象，
 * 但不知道其他同事对象。它只能联系 Mediator 对象。
 *
 * @author wangchangsheng
 * @date 2021/1/31 12:06 上午
 */
abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    // 发送消息功能
    public void send(String message) {
        mediator.send(message, this);
    }

    //接收消息功能
    public abstract void notify(String message);
}
