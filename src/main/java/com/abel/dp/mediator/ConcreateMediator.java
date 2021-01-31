package com.abel.dp.mediator;

/**
 * description 需要了解并维护所有的colleage对象
 *
 * @author wangchangsheng
 * @date 2021/1/31 12:08 上午
 */
public class ConcreateMediator extends Mediator{
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    // 判断，不是本人则调用另外对象的通知功能
    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.notify(message);
        } else if (colleague == colleague2) {
            colleague1.notify(message);
        } else {
            System.out.println("Error!");
        }
    }
}
