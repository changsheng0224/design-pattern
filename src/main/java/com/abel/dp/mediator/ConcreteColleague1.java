package com.abel.dp.mediator;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/31 12:08 上午
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("同事1得到信息：" + message);
    }
}
