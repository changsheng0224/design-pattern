package com.abel.dp.mediator;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/31 12:10 上午
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("同事2得到信息：" + message);
    }
}
