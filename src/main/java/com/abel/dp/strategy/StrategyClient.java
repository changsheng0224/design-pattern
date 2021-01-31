package com.abel.dp.strategy;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/26 10:59 下午
 */
public class StrategyClient {
    public static void main(String[] args) {

        Context context;
        context = new Context(new ConcreteStrageA());
        context.contextInterface();

        context = new Context(new ConcreteStrategeB());
        context.contextInterface();
    }
}
