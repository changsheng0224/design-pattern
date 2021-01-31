package com.abel.dp.bridge;

/**
 * description TODO
 *
 * @author wangchangsheng
 * @date 2021/1/23 9:24 下午
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstraction();
        ab.setImplementor(new ConcreteImplementorA());
        ab.operation();

        ab.setImplementor(new ConcreteImplementorB());
        ab.operation();
    }
}
