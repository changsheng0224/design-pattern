package com.abel.dp.factory;

import org.junit.Test;
/**
 * description 简单工厂模式
 *
 * @author wangchangsheng
 * @date 2021/1/10 9:11 PM
 */
public class FactoryPatternTest {
    @Test
    public void testFactory() throws Exception {
        Operation operation = OperationFactory.createOperate("+");
        operation.set_numberA(11);
        operation.set_numberB(12);
        System.out.println(operation.getResult());
    }
}
