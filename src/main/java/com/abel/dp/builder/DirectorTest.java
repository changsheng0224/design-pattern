package com.abel.dp.builder;

/**
 * description 测试方法
 *
 * @author wangchangsheng
 * @date 2021/1/17 11:33 下午
 */
public class DirectorTest {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        director.constructor(b1);
        Product p1 = b1.getResult();
        p1.show();

        System.out.println(">>>>>>>>>>");

        Builder b2 = new ConcreteBuilder2();
        director.constructor(b2);
        Product p2 = b2.getResult();
        p2.show();

    }
}
