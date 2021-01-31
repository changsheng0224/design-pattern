package com.abel.dp.mediator;

/**
 * description
 *
 * @author wangchangsheng
 * @date 2021/1/31 12:23 上午
 */
public class MediatorClient {
    public static void main(String[] args) {
        ConcreateMediator mediator = new ConcreateMediator();
        // 让两个具体同事类认识中介者对象
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        //让中介者认识各个具体同事类对象
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        // 具体同事类对象的发送信息都是通过中介者转发
        colleague1.send("How are you?");
        colleague2.send("Fine, thank you. And you ?");
        colleague1.send("I'm fine. Thanks.");
    }
}
